package org.util;

import org.hcc.CloverHandler;
import org.hcc.SCC;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestSuiteGenerator {

    public static String basename = "";
    static Logger logger = Logger.getLogger("rq2.log");

    public static void main(String[] args) throws Exception {

        FileHandler fh;
        fh = new FileHandler("rq2.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.setUseParentHandlers(false);

        //--------------input process--------------------
        if (args.length == 0)
            throw new IllegalArgumentException("insufficient parameters! param 1: slice path, param2: clover.xml path, param3: output dir, param4: prefix.txt");

        String slice_dir = args[0];
        String clover_dir = args[1];
        if (clover_dir.endsWith("/"))
            clover_dir = clover_dir.substring(0, clover_dir.length() - 1);

        String testDir = args[2];
        if (testDir.endsWith("/")) {
            testDir = testDir.substring(0, testDir.length() - 1);
        }
        logger.info("testDir:" + testDir);


        String newTestSuiteDir = args[3];
        if (newTestSuiteDir.endsWith("/")) {
            newTestSuiteDir = newTestSuiteDir.substring(0, newTestSuiteDir.length() - 1);
        }
        logger.info("newTestSuiteDir:" + newTestSuiteDir);

        String prefixPath = args[4];
        String test_dir_package = args[5];
        basename = "project";

        //-----------end reading arguments-----------

        StringBuilder sb = new StringBuilder();
        sb.append("assertion_enabled(%),0, 1, 2, 5, 7, 10, 15, 20, 25, 30, 45, 55, 65, 75, 100\n");
        int[] interval = {0, 1, 2, 5, 7, 10, 15, 20, 25, 30, 45, 55, 65, 75, 100};

        int total_stmt_in_project;
        int total_ex_stmt_in_project;


        //start: read all slices and store in a list
        List<String> all_slices = new ArrayList<>(); //all slice contains all slice file paths
        File dir = new File(slice_dir);
        if (dir.isFile()) {
            all_slices.add(dir.getAbsolutePath());
        } else Util.search(".*\\.txt", dir, all_slices);
        logger.info("total slices = total criteria = total assertions = " + all_slices.size());

        sb.append("coverage_gap(PP),");
        Set<String> all_executed_stmts = new HashSet<>();
        Set<String> all_missed_stmts = new HashSet<>();
        CloverHandler ch = new CloverHandler();
        HashMap<String, CloverHandler.StmtCov> sc_per_method = new HashMap<>();  //class, stats
        HashMap<String, CloverHandler.StmtCov> sc_per_class = new HashMap<>();   //method, stats
        ch.getCloverCov(clover_dir, sc_per_class, sc_per_method, all_executed_stmts, all_missed_stmts);
        total_ex_stmt_in_project = all_executed_stmts.size();
        total_stmt_in_project = total_ex_stmt_in_project + all_missed_stmts.size();
        logger.info("total statement :" + total_stmt_in_project);
        logger.info("total executed statement :" + total_ex_stmt_in_project);

        for (int j = 0; j < interval.length; j++) {

            int per_of_assertion_enabled = interval[j];

            //copy all_slices to copy_of_all_slices to avoid shallow copy
            List<String> copy_of_all_slices = new ArrayList<>(all_slices);
            Collections.shuffle(copy_of_all_slices); //do some shuffling

            //select random criteria from all slices
            List<String> selected_random_assertions = new Util().getRandomAssertions(copy_of_all_slices, per_of_assertion_enabled);
            List<String> disabled_assertion = new ArrayList<>(copy_of_all_slices); //assertion those are not enabled

            new TestSetGenerator().generateTestSets(disabled_assertion, newTestSuiteDir, per_of_assertion_enabled, testDir, test_dir_package);


            SCC cov_cal = new SCC();
            Set<String> prefix = cov_cal.readPrefixes(prefixPath);


            logger.info("selected_random_assertions: " + selected_random_assertions.size());
            logger.info("disabled_assertion: " + disabled_assertion.size());


            HashMap<String, SCC.CovRecord> scc_per_method = new HashMap<>();  //class, stats
            HashMap<String, SCC.CovRecord> scc_per_class = new HashMap<>();   //method, stats

            HashMap<String, Set<String>> per_assertion_cov = new HashMap<>();

            for (String slice_path : selected_random_assertions) {
                cov_cal.get_coverage(slice_path, scc_per_method, scc_per_class, all_executed_stmts, per_assertion_cov, prefix);
            }

            printProjectSCC(scc_per_class, total_ex_stmt_in_project, total_stmt_in_project,sb);
        }
        sb.append("\n");
        System.out.println(sb);

        PrintWriter writer = new PrintWriter(newTestSuiteDir+"/rq2_test_suites/result.txt", "UTF-8");
        writer.println(sb);
        writer.close();

    }

    private static void printProjectSCC(HashMap<String, SCC.CovRecord> scc_per_class, int total_ex_stmt_in_project, int total_stmt_in_project, StringBuilder sb) throws Exception {

        int total_cov = 0;
        for (String c_name : scc_per_class.keySet()) {
            Set<String> stmts = scc_per_class.get(c_name).covered_stmts;
            total_cov += stmts.size();
        }
        logger.info("total checked : " + total_cov);
        sb.append(((float) (total_ex_stmt_in_project - total_cov) / total_stmt_in_project) * 100 + ",");
    }
}