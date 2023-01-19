package hcc;

import util.Util;

import java.io.*;
import java.util.*;

public class SCC {

    static boolean print_logger = false;

    public static void main(String[] args) throws Exception {

        if (args.length == 0)
            throw new IllegalArgumentException("insufficient parameters! param 1: slice path, param2: clover.xml path, param3: output dir, param4: prefix.txt");

        String slice_parent_dir = args[0];   //slice dir
        String clover_cov_dir = args[1];     //"clover.xml
        if (clover_cov_dir.endsWith("/"))
            clover_cov_dir = clover_cov_dir.substring(0, clover_cov_dir.length() - 1);
        String outputDir = args[2]; //output dir
        if (outputDir.endsWith("/"))
            outputDir = outputDir.substring(0, outputDir.length() - 1);

        String prefixPath = args[3]; //prefix path to restrict the scope

        //--------------read regular coverage--------------------
        CloverHandler ch = new CloverHandler();
        HashMap<String, CloverHandler.StmtCov> SC_per_method = new HashMap<>();  //statement cov per method
        HashMap<String, CloverHandler.StmtCov> SC_per_class = new HashMap<>();   //statement cov per class
        Set<String> all_executed_stmts = new HashSet<>();

        ch.getCloverCov(clover_cov_dir, SC_per_class, SC_per_method, all_executed_stmts);// clover_stmt, per_file_locations, total_stmt_for_file
        int total_executed = all_executed_stmts.size();
        int total_missed = ch.printCoverage(SC_per_class, SC_per_method, outputDir);
        int total_stmt = total_executed + total_missed;
        //----------------------------------------------------------------------------------

        //start: read all slices and store them in a list
        List<String> all_slices = new ArrayList<>(); //holds all slice files
        File slice_dir = new File(slice_parent_dir);
        if (slice_dir.isFile()) {
            all_slices.add(slice_dir.getAbsolutePath());
        } else Util.search(".*\\.txt", slice_dir, all_slices);
        System.out.println("total slices = total criteria = total assertions = " + all_slices.size());
        //end: reading slice files

        Set<String> prefix = readPrefixes(prefixPath); //could have multiple prefixes

        SCC cov_cal = new SCC();
        HashMap<String, CovRecord> SCC_per_method = new HashMap<>();  //Statement Checked Coverage (SCC) per method
        HashMap<String, CovRecord> SCC_per_class = new HashMap<>();   //SCC per class
        HashMap<String, Set<String>> per_assertion_cov = new HashMap<>();

        for (String slice_path : all_slices) {
            cov_cal.get_coverage(slice_path, SCC_per_method, SCC_per_class, all_executed_stmts, per_assertion_cov, prefix);
        }
        printCoverage(SCC_per_method, SCC_per_class, SC_per_class, SC_per_method, per_assertion_cov, outputDir, total_executed, total_missed);
    }


    static void printCoverage(HashMap<String, CovRecord> SCC_per_method, HashMap<String, CovRecord> SCC_per_class, HashMap<String, CloverHandler.StmtCov> SC_per_class, HashMap<String, CloverHandler.StmtCov> SC_per_method, HashMap<String, Set<String>> per_assertion_cov, String outputDir, int total_executed, int total_missed) throws Exception {
        int total_cov = 0;

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(outputDir + "/scc_per_class.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "class,sc(%),scc(%),gap(pp)";
        builder.append(columnNamesList + "\n");

        for (String c_name : SCC_per_class.keySet()) {
            Set<String> stmts = SCC_per_class.get(c_name).covered_stmts;
            total_cov += stmts.size();

            CloverHandler.StmtCov sc = SC_per_class.get(c_name);
            float scc = ((float) stmts.size() / (float) sc.total()) * 100;
            if (sc.getCoverage() - scc < 0) throw new Exception();
            builder.append(c_name + "," + sc.getCoverage() + "," + scc + "," + (sc.getCoverage() - scc) + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        System.out.println("total checked statements in class: " + total_cov);

        try {
            pw = new PrintWriter(outputDir + "/scc_per_method.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        builder = new StringBuilder();
        columnNamesList = "method,sc(%),scc(%),gap(pp)";
        builder.append(columnNamesList + "\n");
        total_cov = 0;

        for (String m_name : SCC_per_method.keySet()) {
            Set<String> stmts = SCC_per_method.get(m_name).covered_stmts;
            total_cov += stmts.size();

            CloverHandler.StmtCov sc = SC_per_method.get(m_name);
            float scc = ((float) stmts.size() / (float) sc.total()) * 100;

            if (sc.getCoverage() - scc < 0) throw new Exception();
            builder.append(m_name + "," + sc.getCoverage() + "," + scc + "," + (sc.getCoverage() - scc) + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        System.out.println("total checked statements in methods: " + total_cov);

        //print per assertion coverage
        //-----------------------------------------------------------

        builder = new StringBuilder();
        try {
            pw = new PrintWriter(outputDir + "/scc_per_assertion.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int total_criterion = 0;
        for (String criterion : per_assertion_cov.keySet()) {
            total_criterion++;
            Set<String> stmts = per_assertion_cov.get(criterion);
            builder.append("criterion: " + criterion + "\n");
            if (stmts != null) {
                for (String stmt : stmts) {
                    builder.append("\t" + stmt + "\n");
                }
            }
        }
        pw.write(builder.toString());
        pw.close();
        System.out.println("total assertions/criteria: " + total_criterion);

        try {
            pw = new PrintWriter(outputDir + "/scc.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        builder = new StringBuilder();
        columnNamesList = "total_stmt, total_executed, total_missed, total_checked_stmt, total_assertion";
        builder.append(columnNamesList + "\n");
        builder.append(total_executed + total_missed + "," + total_executed + "," + total_missed + "," + total_cov + "," + total_criterion + "\n");
        pw.write(builder.toString());
        pw.close();

    }

    private void get_coverage(String path, HashMap<String, CovRecord> SCC_per_method,
                              HashMap<String, CovRecord> SCC_per_class, Set<String> all_executed_stmts,
                              HashMap<String, Set<String>> per_assertion_cov, Set<String> prefixes) throws FileNotFoundException {

        boolean start_cov_cal = false;
        File slice = new File(path);
        Scanner sc = new Scanner(slice);
        Set<String> checked_stmt_for_assertion = null;

        while (sc.hasNextLine()) {

            String line_from_slice = sc.nextLine();

            if (line_from_slice.startsWith("The dynamic slice for criterion ")) {
                start_cov_cal = true;
                String criterion = line_from_slice.substring("The dynamic slice for criterion [".length());
                criterion = criterion.replaceAll(":\\*]:", "");
                //System.out.println(criterion);
                checked_stmt_for_assertion = per_assertion_cov.get(criterion);
                if (checked_stmt_for_assertion == null) {
                    checked_stmt_for_assertion = new HashSet<>();
                    per_assertion_cov.put(criterion, checked_stmt_for_assertion);
                }
            } else if (line_from_slice.startsWith("Slice consists of")) {
                break;  //end of slice
            } else if (start_cov_cal) {

                if (line_from_slice.trim().length() == 0) continue;
                // example: paper_examples.Triangle.<init>:9 PUTFIELD paper_examples/Triangle.side1 I
                StringTokenizer tokenizer = new StringTokenizer(line_from_slice, " "); // tokenizing using space
                String location = tokenizer.nextToken().trim(); // paper_examples.Triangle.<init>:9

                boolean prefixFound = false;

                for (String prefix : prefixes) {
                    if (location.startsWith(prefix)) {
                        prefixFound = true;
                        break;
                    }
                }

                if (!prefixFound) continue;

                String[] loc_token = location.split(":"); //tokenizing using :
                if (loc_token.length < 2) continue;

                String pkg_class_method = loc_token[0]; //paper_examples.Triangle.<init>
                String[] pkg_class_method_tokens = pkg_class_method.split("\\.");

                String pkg = "";
                String method_name = "";
                String className = "";

                for (int i = 0; i < pkg_class_method_tokens.length; i++) {
                    if (i == pkg_class_method_tokens.length - 1) {
                        method_name = pkg_class_method_tokens[i];
                    } else if (i == pkg_class_method_tokens.length - 2) {
                        className = pkg_class_method_tokens[i];
                    } else if (i == pkg_class_method_tokens.length - 3) {
                        pkg += pkg_class_method_tokens[i];
                    } else pkg += pkg_class_method_tokens[i] + ".";
                }

                if (className.startsWith("Test") || className.endsWith("Test")) continue;
                if (className.contains("$")) {  //$ might be seen when there are inner or nested classes exist
                    className = className.substring(0, className.indexOf("$"));
                }

                String pkg_class_method_line = pkg + "." + className + "." + method_name + ":" + loc_token[1];

                if (all_executed_stmts.contains(pkg_class_method_line)) {
                    //SCC per class
                    String class_key = pkg + "." + className;
                    CovRecord cr_for_class = SCC_per_class.get(class_key);
                    if (cr_for_class == null) {
                        cr_for_class = new CovRecord();
                        SCC_per_class.put(class_key, cr_for_class);
                    }
                    cr_for_class.covered_stmts.add(location);

                    //SCC for method
                    String method_key = pkg + "." + className + "." + method_name;
                    CovRecord cr_method = SCC_per_method.get(method_key);
                    if (cr_method == null) {
                        cr_method = new CovRecord();
                        SCC_per_method.put(method_key, cr_method);
                    }
                    cr_method.covered_stmts.add(location);
                    checked_stmt_for_assertion.add(location);
                }

            }
        }
    }

    private static Set<String> readPrefixes(String prefixPath) throws IOException {

        FileReader fr = new FileReader(prefixPath);
        BufferedReader br = new BufferedReader(fr);
        String currentLine = br.readLine();
        Set<String> prefixes = new HashSet<>();

        while (currentLine != null) {
            prefixes.add(currentLine.trim());
            currentLine = br.readLine();
        }
        br.close();
        return prefixes;
    }

    private class CovRecord {
        public Set<String> covered_stmts = new HashSet<>();
    }

}
