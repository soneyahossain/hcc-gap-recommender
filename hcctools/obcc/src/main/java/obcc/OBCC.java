package obcc;

import util.Util;
import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class OBCC {

    static Logger logger = Logger.getLogger("OBCC");

    public static void main(String[] args) throws Exception {

        //--------------input process--------------------
        if (args.length == 0)
            throw new IllegalArgumentException("insufficient parameters! param 1: slice path, param2: jacoco.xml path, param3: output dir");

        String slice_parent_dir = args[0]; //slice dir
        if (slice_parent_dir.endsWith("/"))
            slice_parent_dir = slice_parent_dir.substring(0, slice_parent_dir.length() - 1);
        String jacoco_xml = args[1]; //JaCoCo cov
        if (jacoco_xml.endsWith("/"))
            jacoco_xml = jacoco_xml.substring(0, jacoco_xml.length() - 1);
        String outputDir = args[2];
        if (outputDir.endsWith("/"))  //output dir
            outputDir = outputDir.substring(0, outputDir.length() - 1);

        String prefixPath = args[3]; //prefix

        FileHandler fh;
        fh = new FileHandler(outputDir + "/obcc.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.setUseParentHandlers(false);

//----------------------reading slices ----------------------------------

        //start: read all slices and store in a list
        List<String> all_slices = new ArrayList<>(); //all slice contains all slice file paths
        File dir = new File(slice_parent_dir);
        if (dir.isFile()) {
            all_slices.add(dir.getAbsolutePath());
        } else Util.search(".*\\.txt", dir, all_slices);
        logger.info("total slices = total criteria = total assertions = " + all_slices.size());
//----------------------reading slices ----------------------------------


//----------------------parsing jacoco----------------------------------
        OBCovParser obcParser = new OBCovParser();
        HashMap<String, OBCovParser.OBranchCov> obc_per_method = new HashMap<>();
        HashMap<String, OBCovParser.OBranchCov> obc_per_class = new HashMap<>();
        obcParser.getJacocoCov(jacoco_xml, obc_per_method, obc_per_class);
        obcParser.printCSV(obc_per_method, obc_per_class, outputDir);
//----------------------parsing jacoco----------------------------------

        OBCC obcc = new OBCC();
        HashMap<String, HashMap<String, Set<String>>> object_branch = new HashMap<>();   //HashMap<decision_loc, HashMap<con_in_dec_key, Set<true_false_pattern>>>
        Set<String> prefix = readPrefixes(prefixPath);

        for (String slice_path : all_slices) {
            obcc.getOBCC(slice_path, object_branch, prefix);
        }
        HashMap<String, Integer> dec_to_ob_branch = obcc.processDecisionAgain(object_branch);
        int total_covered = obcc.printOBCC(dec_to_ob_branch, obc_per_class, obc_per_method, outputDir, obcParser, all_slices.size());

        logger.info("OBC :" + obcParser.getOBC());
        logger.info("OBCC :" + ((double) total_covered / (double) obcParser.getTotalConditions() * 100));

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

    private HashMap<String, Integer> processDecisionAgain(HashMap<String, HashMap<String, Set<String>>> object_branch) throws Exception {

        HashMap<String, Integer> dec_to_ob_branch = new HashMap<String, Integer>();

        for (String dec_loc : object_branch.keySet()) //for each decision found
        {
            HashMap<String, Set<String>> dec_map = object_branch.get(dec_loc);
            int total_obc = 0;
            for (String con_loc : dec_map.keySet())  // for each condition found
            {
                Set<String> set = dec_map.get(con_loc);
                if (set.size() > 2) {
                    total_obc += 2;
                } else total_obc += set.size();
            }
            dec_to_ob_branch.put(dec_loc, total_obc);
        }
        return dec_to_ob_branch;
    }

    public void getOBCC(String path, HashMap<String, HashMap<String, Set<String>>> object_branch, Set<String> prefixes) throws Exception {

        //logger.info(path);
        File slice = new File(path);
        Scanner sc = new Scanner(slice);
        boolean start_cov_cal = false;
        String prev_stmt = "";
        String prev_loc = "";
        while (sc.hasNextLine()) {

            String line_from_slice = sc.nextLine();

            if (line_from_slice.startsWith("The dynamic slice for criterion")) {
                start_cov_cal = true;
            } else if (line_from_slice.startsWith("Slice consists of")) {
                break;  // end of slice
            } else if (start_cov_cal) { //start computing coverage


                if (line_from_slice.trim().length() == 0) continue;
                //logger.info(line_from_slice);

                //now consider conditionals
                //example 1: test_cov.Loop1.loop1:10 IFLT L3 true true
                //example 2: test_cov.Loop1.loop1:11 IFNE L1 true true

                StringTokenizer tokenizer = new StringTokenizer(line_from_slice, " "); // tokenizing using space
                //assert (tokenizer.countTokens() >= 3); //condition has at least three tokens
                String location = tokenizer.nextToken().trim(); //org.xml.sax.InputSource.getSystemId:237

                String[] loc_token = location.split(":"); // tokenizing using dot
                if (loc_token.length < 2) continue;

                String pkg_class_method = loc_token[0];

                boolean prefixFound = false;
                for (String prefix : prefixes) {
                    if (location.startsWith(prefix)) {
                        prefixFound = true;
                        break;
                    }
                }

                if (!prefixFound) continue;

                //remove slice from test classes
                String[] pkg_class_method_tokens = pkg_class_method.split("\\.");
                String className = pkg_class_method_tokens[pkg_class_method_tokens.length - 2];
                if (className.startsWith("Test") || className.endsWith("Test")) continue;


                String cmp_instr = tokenizer.nextToken().trim(); //e.g.  IFNE

                if (CondInstr.c_instr.contains(cmp_instr.trim())) {
                    //found a condition, now get all the statements from this line and send for further processing
                    //if(!prev_loc.equals(location)) throw new Exception("exception in condition processing");

                    String[] decision = new String[100];
                    int count = 0;
                    if (prev_stmt.trim().length() > 0) {
                        decision[count++] = prev_stmt;  //insert the previous line
                    }

                    while (prev_loc.equals(location)) {
                        decision[count++] = line_from_slice; //insert the current stmt

                        if (sc.hasNextLine()) {
                            line_from_slice = sc.nextLine().trim();
                            if (line_from_slice.length() == 0) break;
                            tokenizer = new StringTokenizer(line_from_slice, " "); // tokenizing using space
                            location = tokenizer.nextToken().trim(); //org.xml.sax.InputSource.getSystemId:237
                        }
                    }
                    if (count > 0) processDecision(decision, count, prev_loc, object_branch);
                }
                prev_loc = location;
                prev_stmt = line_from_slice;
            }
        }
    }

    private void processDecision(String[] decision, int count, String prev_loc, HashMap<String, HashMap<String, Set<String>>> object_branch) {
        HashMap<String, Set<String>> decisionMap = object_branch.get(prev_loc);

        if (decisionMap == null) {
            decisionMap = new HashMap<String, Set<String>>();
            object_branch.put(prev_loc, decisionMap);
        }

        String key = ""; //key is the immediate byte code instruction before the condition
        boolean firstCond = true;
        /*
          example:
          key: SimpleClassify.classify:7 ILOAD 0
               SimpleClassify.classify:7 IFLE L0 false true
        */
        for (int i = 0; i < count; i++) {
            StringTokenizer tokenizer = new StringTokenizer(decision[i], " "); // tokenizing using space
            String location = tokenizer.nextToken().trim(); //org.xml.sax.InputSource.getSystemId:237 //do not remove
            //System.out.println(location);
            String cond = tokenizer.nextToken().trim();
            if (CondInstr.c_instr.contains(cond)) {
                if (firstCond) {
                    firstCond = false;
                    key = "firstCond";
                }
                Set<String> branch_visited = decisionMap.get(key);
                if (branch_visited == null) {
                    branch_visited = new HashSet<>();
                    decisionMap.put(key, branch_visited);
                }
                tokenizer.nextToken(); //for skipping label LO, L2
                String branchV = tokenizer.nextToken() + tokenizer.nextToken();
                branch_visited.add(branchV);
            }
            key = decision[i];
        }
    }


    private int printOBCC(HashMap<String, Integer> object_branch, HashMap<String, OBCovParser.OBranchCov> obc_per_class, HashMap<String, OBCovParser.OBranchCov> obc_per_method, String outputDir, OBCovParser obcParser, int size) throws Exception {

        //iterate map
        int total_cov = 0;
        HashMap<String, Integer> obcc_class = new HashMap<>();
        HashMap<String, Integer> obcc_method = new HashMap<>();

        //logger.info("condition in the map: " + object_branch.size());
        //this loop populates class and method level coverage

        for (String loc : object_branch.keySet()) {

            String[] loc_token = loc.split(":"); // tokenizing using dot
            String method_name = loc_token[0];
            String class_name = method_name.substring(0, method_name.lastIndexOf("."));

            int total = object_branch.get(loc);
            total_cov += total;

            //now store the total covered for class in the map
            Integer cov_of_class = obcc_class.get(class_name);
            if (cov_of_class == null) {
                cov_of_class = total;
                obcc_class.put(class_name, cov_of_class);
            } else {
                cov_of_class += total;
                obcc_class.put(class_name, cov_of_class);
            }

            //now store the total covered for method in the map
            Integer cov_of_method = obcc_method.get(method_name);
            if (cov_of_method == null) {
                cov_of_method = total;
                obcc_method.put(method_name, cov_of_method);
            } else {
                cov_of_method += total;
                obcc_method.put(method_name, cov_of_method);
            }
        }

        logger.info("Total condition covered: " + total_cov);

        //now print ob, obcc, gap for class and methods in two separate csv files

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File(outputDir + "/" + "obcc_class.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "class,obc(%),obcc(%),gap(pp)";
        builder.append(columnNamesList + "\n");

        for (String class_name : obcc_class.keySet()) {
            if (obc_per_class.get(class_name) == null) {
                logger.warning(class_name + " class not found in the jacoco report report");
                //throw new Exception("class not found in the jacoco report");
                continue;
            }
            float obc = obc_per_class.get(class_name).getCoverage();
            float obcc = ((float) obcc_class.get(class_name) / (float) obc_per_class.get(class_name).getTotalConds()) * 100;
            if (obc < obcc) {
                logger.warning("obc<obcc: " + class_name + " " + obc + " " + obcc);
                //throw new Exception("obc<obcc");
                continue;
            }
            builder.append(class_name + "," + obc + "," + obcc + "," + (obc - obcc) + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        logger.info("successfully generate per class coverage for object branch!");

        pw = null;
        try {
            pw = new PrintWriter(new File(outputDir + "/" + "obcc_method.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        builder = new StringBuilder();
        columnNamesList = "method,obc(%),obcc(%),gap(pp)";
        builder.append(columnNamesList + "\n");

        for (String m_name : obcc_method.keySet()) {

            if (obc_per_method.get(m_name) == null) {
                logger.warning(m_name + " not found in the jacoco report");
                continue;
            }
            float obc = obc_per_method.get(m_name).getCoverage();
            float obcc = ((float) obcc_method.get(m_name) / (float) obc_per_method.get(m_name).getTotalConds()) * 100;
            if (obc < obcc) {
                logger.warning("obc<obcc: " + m_name + " " + obc + " " + obcc + " " + obcc_method.get(m_name));
                //throw new Exception("OB is less than OBCC");
                continue;
            }

            builder.append(m_name + "," + obc + "," + obcc + "," + (obc - obcc) + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        logger.info("successfully generate per method coverage for object branch!");


        pw = null;
        try {
            pw = new PrintWriter(new File(outputDir + "/" + "obcc.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        builder = new StringBuilder();
        columnNamesList = "total_branch,total_executed,total_missed,total_checked,total_criteria";
        builder.append(columnNamesList + "\n");
        builder.append(obcParser.getTotalConditions() + "," + obcParser.getTotalExecutedConditions() + "," + obcParser.getTotalMissedConditions() + "," + total_cov + "," + size + "\n");
        pw.write(builder.toString());
        pw.close();
        return total_cov;
    }
}
