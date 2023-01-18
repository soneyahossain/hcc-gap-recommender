package evaluation;

import bytecodeparser.BytecodeReader;
import bytecodeparser.MethodInfo;
import callgraph.CallGraphBuilder;
import org.apache.commons.io.FileUtils;
import recommender.AssertRecommender;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class RecommendationEvaluator {


    static int[] top_ns = {1, 5, 10};

    public static void main(String[] args) throws Exception {

        if (args.length == 0)
            throw new IllegalArgumentException("insufficient parameters!");

        Set<String> unique_focus_methods = new HashSet<>();
        int total_exception = 0;

        String per_assertion_cov = args[0];
        String targetDir = args[1];
        if (targetDir.endsWith("/")) {
            targetDir = targetDir.substring(0, targetDir.length() - 1);
        }

        String sourceClassPath = targetDir + "/classes/";
        String testClassPath = targetDir + "/test-classes/";
        String outDir = args[2];
        if (!outDir.endsWith("/")) outDir = outDir + "/";

        Path path = Paths.get(outDir);

        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("output dir created" + path.toAbsolutePath());
        } else {

            System.out.println("output dir exists, cleaning directory");
            FileUtils.cleanDirectory(new File(outDir));
        }

        Path result = Paths.get(outDir + "result");
        if (!Files.exists(result)) {
            Files.createDirectory(result);
            System.out.println("result dir created at" + result.toAbsolutePath());
        } else {
            System.out.println("result dir exists, cleaning directory");
            FileUtils.cleanDirectory(new File(outDir + "result"));
        }

        String prefixPath = args[3];
        Set<String> prefix = readPrefixes(prefixPath);
        //-----------------------------------------------------------------------------------

        HCC hcc = new HCC(per_assertion_cov);
        AssertRecommender ar = new AssertRecommender(sourceClassPath);
        BytecodeReader br = new AssertRecommender(testClassPath).getReader();
        CallGraphBuilder cgb = new CallGraphBuilder(); //building the call graph for the whole source
        HashMap<String, Set<String>> CallGraph = cgb.buildCallGraph(sourceClassPath, outDir);

        //----------------------------------------------------------------------------------------------

        for (int i = 0; i < top_ns.length; i++) {

            int top_n = top_ns[i];

            int recommended;
            int total_recommended = 0;

            int exact_match;
            int total_exact_match = 0;
            int top_n_match;
            int total_top_n_match = 0;
            int total_assertion_pkg;
            int total_assertion_project = 0;


            PrintWriter pw = new PrintWriter(outDir + "result/result_top_" + top_n + ".csv");
            StringBuilder builder = new StringBuilder();
            String columnNamesList = "package,assertion_tested,exact_match,top_" + top_n + ",all_method_suggested";
            builder.append(columnNamesList + "\n");

            for (String pkg : hcc.per_pkg_criteria.keySet()) {

                recommended = 0;
                exact_match = 0;
                top_n_match = 0;
                total_assertion_pkg = 0;

                System.out.println("package name:" + pkg);
                System.out.println("size: " + hcc.per_pkg_criteria.get(pkg).size());

                for (String criterion : hcc.per_pkg_criteria.get(pkg)) {
                    System.out.println("criterion: " + criterion);
                    String assert_id = hcc.getMethodFromCriteria(criterion) + total_assertion_pkg;

                    //filter assertion that calls method from a test class
                    Set<String> methodCalls = getMethodCallsFromAssert(br, criterion, prefix);
                    boolean has_excep = false;
                    if (methodCalls == null || methodCalls.size() == 0) {
                        System.out.println("no method call found");
                        continue;
                    } else {  //exclude method calls from the test class
                        Set<String> callsFromTestClass = new HashSet<>();
                        for (String call : methodCalls) {
                            System.out.println(call);
                            if (call.contains("Test")) {
                                callsFromTestClass.add(call);
                            } else {
                                if (call.toLowerCase().contains("exception")) has_excep = true;
                            }
                        }
                        methodCalls.removeAll(callsFromTestClass);
                        if (methodCalls.size() == 0) {
                            System.out.println("no method calls found after removing calls from test class");
                            continue;
                        }

                        unique_focus_methods.addAll(methodCalls);
                    }
                    //--------------------filter assertion for which omc_s is zero----------------------------------
                    Set<String> checkedStmts = hcc.getAssertionCov(criterion); //getting coverage for the assertion

                    if (checkedStmts == null || checkedStmts.size() == 0) {
                        System.out.println("checked coverage 0");
                        continue;
                    }

                    if (has_excep) total_exception++;


                    total_assertion_pkg++;
                    //------------------------------------------------------------------------------------------------

                    //System.out.println("finally here.....");

                    //create a file and write the assertion criterion
                    PrintWriter out = new PrintWriter(outDir + assert_id + "_" + top_n + ".txt");
                    out.append("slicing criterion: " + criterion + "\n");
                    out.append("Methods call in assertion: " + methodCalls + "\n");

                    Set<Set<String>> all_reco_for_assertion = new HashSet<>();

                    for (String stmt : checkedStmts) {
                        String[] tokens = stmt.split(":");
                        String location = tokens[0];
                        String[] location_tokens = location.split("\\.");
                        String method_name = location_tokens[location_tokens.length - 1];
                        location = location.replaceAll("\\.", "\\/");
                        location = location.replaceAll("/" + method_name, "." + method_name);
                        String line_no = tokens[1];

                        Set<String> recommendation = ar.recommendAssertions(location, line_no);
                        if (recommendation != null) {
                            all_reco_for_assertion.add(recommendation);
                            //System.out.println(recommendation);
                        }
                    }

                    Set<String> recommendations = ar.lc_recommendations(all_reco_for_assertion);  //see below example
 /*
Recommendation Narrow Down:
Simplified recommendations such as
[org/joda/time/field/PreciseDurationField.getValueAsLong, org/joda/time/field/PreciseDurationField.equals, org/joda/time/field/PreciseDurationField.getUnitMillis, org/joda/time/field/PreciseDurationField.<init>, org/joda/time/field/PreciseDurationField.add, org/joda/time/field/PreciseDurationField.getDifferenceAsLong, org/joda/time/field/PreciseDurationField.getMillis, org/joda/time/field/PreciseDurationField.hashCode]

[org/joda/time/field/PreciseDurationField.getMillis]

Can be simplified to [org/joda/time/field/PreciseDurationField.getMillis]
*/
                    //printing recommendation before processing
                    for (String rec : recommendations) {
                        out.append(rec + "\n");
                    }

                    //check if the recommendations are exactly the same as the method calls in the assertion body
                    String desc = "";
                    Set<String> topN = new LinkedHashSet();
                    Set<String> rankedR = ar.rank_recommendations(recommendations, CallGraph, topN, top_n);

                    //printing recommendation before processing
                    out.append("top " + top_n + " recommendations: \n");
                    for (String rec : topN) {
                        out.append(rec + "\n");
                    }

                    if (ar.isPerfectMatched(rankedR, methodCalls)) {
                        recommended++;
                        exact_match++;
                        desc = "perfect match" + "\n";
                    } else {
                        boolean match = resolveClassName(rankedR, methodCalls, ar);
                        if (match) {
                            recommended++;
                            if (rankedR.size() == methodCalls.size()) {
                                exact_match++;
                                desc = "perfect match" + "\n";
                            } else if (methodCalls.size() == 1 && rankedR.iterator().next().equals(methodCalls.iterator().next())) {
                                //if only one focus method and the first recommended method is in the list
                                exact_match++;
                                desc = "perfect match" + "\n";

                            } else {

                                if (resolveClassName(topN, methodCalls, ar) && topN.size() <= top_n) {
                                    top_n_match++;
                                    desc = "found in top " + top_n + "\n";
                                } else desc = "all method calls are suggested" + "\n";
                            }
                        } else desc = "not matched" + "\n";
                    }
                    out.append("after post processing ......\n");
                    for (String rec : rankedR) {
                        out.append(rec + "\n");
                    }
                    out.append(desc);
                    out.close();
                }
                total_exact_match += exact_match;
                total_top_n_match += top_n_match;
                total_recommended += recommended;
                total_assertion_project += total_assertion_pkg;
                builder.append(pkg + "," + total_assertion_pkg + "," + exact_match + "," + (exact_match + top_n_match) + "," + recommended + "\n");
            }
            builder.append("total:" + "," + total_assertion_project + "," + total_exact_match + "," + (total_exact_match + total_top_n_match) + "," + total_recommended + "\n");
            pw.write(builder.toString());
            pw.close();


            System.out.println("total_exception: " + total_exception);
        }
        processFinalResults(result, hcc.per_pkg_criteria);
        generateAverageResults(result, hcc.per_pkg_criteria);


        ///only for paper info:


        System.out.println("total unique methods: " + unique_focus_methods.size());
        for (String s : unique_focus_methods) {

            System.out.println(s);
        }

    }

    private static void generateAverageResults(Path result, HashMap<String, Set<String>> per_pkg_criteria) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(result.getParent() + "/result/result.csv"));
        String first_row = br.readLine();
        System.out.println(first_row);
        String line;
        int total_assertion = 0;
        int total_in_top1 = 0;
        int total_in_top5 = 0;
        int total_in_top10 = 0;
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");    // use comma as separator
            total_assertion += getValue(row[1]);
            total_in_top1 += getValue(row[3]);
            total_in_top5 += getValue(row[4]);
            total_in_top10 += getValue(row[5]);
        }

        //now create another file and store the information
        PrintWriter pw = new PrintWriter(result.getParent() + "/result/summary.csv");
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "subject,total_assertion,top_1(%),top_5(%),top_10(%)";
        builder.append(columnNamesList + "\n");


        builder.append("project" + "," +
                total_assertion + "," +
                getPercentage(total_in_top1, total_assertion) + "," +
                getPercentage(total_in_top5, total_assertion) + "," +
                getPercentage(total_in_top10, total_assertion) + "," +
                "\n");
        pw.write(builder.toString());
        pw.close();


    }

    private static int getValue(String s) {
        try {
            int val = Integer.parseInt(s);
            return val;
        } catch (Exception e) {
            return 0;
        }
    }

    private static void processFinalResults(Path result, HashMap<String, Set<String>> per_pkg_criteria) throws IOException {

        //read all three files and merge the results

        HashMap<String, String> pkgToTop1 = new HashMap<>();
        HashMap<String, String> pkgToTop5 = new HashMap<>();
        HashMap<String, String> pkgToTop10 = new HashMap<>();
        HashMap<String, String> pkgToToExactMatch = new HashMap<>();
        HashMap<String, String> pkgToAssertionTested = new HashMap<>();
        HashMap<String, String> pkgToToAll = new HashMap<>();

        for (int i = 0; i < top_ns.length; i++) {

            int top_n = top_ns[i];

            BufferedReader br = new BufferedReader(new FileReader(result.getParent() + "/result/result_top_" + top_n + ".csv"));
            String first_row = br.readLine();
            System.out.println(first_row);
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");    // use comma as separator
                String pkg = row[0];
                String assertion_tested = row[1];
                String exact_match = row[2];
                String topN = row[3];
                String all_method_suggested = row[4];

                if (top_n == 1) pkgToTop1.put(pkg, topN);
                if (top_n == 5) pkgToTop5.put(pkg, topN);
                if (top_n == 10) pkgToTop10.put(pkg, topN);

                pkgToAssertionTested.put(pkg, assertion_tested);
                pkgToToExactMatch.put(pkg, exact_match);
                pkgToToAll.put(pkg, all_method_suggested);
            }
        }

        //now create another file and store the information
        PrintWriter pw = new PrintWriter(result.getParent() + "/result/result.csv");
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "package,total_assertion,exact_match(%),top_1(%),top_5(%),top_10(%),all_method_suggested(%)";
        builder.append(columnNamesList + "\n");

        for (String pkg : per_pkg_criteria.keySet()) {
            //System.out.println(pkg);
            builder.append(pkg + "," +
                    pkgToAssertionTested.get(pkg) + "," +
                    pkgToToExactMatch.get(pkg) + "," +    //getPercentage(pkgToToExactMatch.get(pkg),pkgToAssertionTested.get(pkg) )+ "," +
                    pkgToTop1.get(pkg) + "," +    //getPercentage(pkgToTop1.get(pkg),pkgToAssertionTested.get(pkg) ) + "," +
                    pkgToTop5.get(pkg) + "," +    //getPercentage(pkgToTop5.get(pkg),pkgToAssertionTested.get(pkg) ) + "," +
                    pkgToTop10.get(pkg) + "," +    //getPercentage(pkgToTop10.get(pkg),pkgToAssertionTested.get(pkg) ) + "," +
                    pkgToToAll.get(pkg) + "," +    //getPercentage(pkgToToAll.get(pkg),pkgToAssertionTested.get(pkg) ) + "," +
                    "\n");

        }
        pw.write(builder.toString());
        pw.close();
    }

    private static String getPercentage(int value, int total) {
        double percentage = ((double) value / (double) total) * 100;
        return String.format("%.2f", percentage);
    }

    public static boolean resolveClassName(Set<String> recommendations, Set<String> focusCalls, AssertRecommender ar) {

        for (String focus_call : focusCalls) {

            String focus_method = focus_call.substring(focus_call.lastIndexOf(".") + 1);
            String focus_class = focus_call.substring(0, focus_call.lastIndexOf("."));

            if (!recommendations.contains(focus_call)) {  //if not exact match, then need to resolve the sub-super class name

                boolean found = false;

                //for each focus method not matched
                for (String reco : recommendations) {

                    if (reco.contains(focus_method)) {  //found some recommendation with the same method calls

                        //now, need to check its sub and super class to see if methods are called from there
                        String reco_class = reco.substring(0, reco.lastIndexOf("."));
                        //System.out.println("here:"+ reco_class);


                        //get all super class
                        String immediateSuperClass = ar.getReader().fromClassToSuper.get(reco_class);

                        while (immediateSuperClass != null) {
                            String new_rec = immediateSuperClass + "." + focus_method;
                            if (new_rec.equals(focus_call)) {
                                found = true;
                                break;
                            } else {
                                String sc = ar.getReader().fromClassToSuper.get(immediateSuperClass);
                                if (sc == null || sc.equals(immediateSuperClass)) break;
                                else immediateSuperClass = sc;
                            }
                        }
                        if (found) break;

                        //now, check from interface
                        String interfaceClass = ar.getReader().fromClassToInterface.get(reco_class);
                        if (interfaceClass != null) {
                            String new_rec = interfaceClass + "." + focus_method;
                            if (new_rec.equals(focus_call)) {
                                found = true;
                            }
                        }
                        if (found) break;

                        //now, check from superclass of the focus class
                        String superclass = ar.getReader().fromClassToSuper.get(focus_class);
                        while (superclass != null) {
                            String new_rec = superclass + "." + focus_method;
                            if (new_rec.equals(reco)) {
                                found = true;
                                break;
                            } else {
                                String sc = ar.getReader().fromClassToSuper.get(superclass);
                                if (sc == null || sc.equals(superclass)) break;
                                else superclass = sc;
                            }
                        }
                        if (found) break;
                    }
                }
                if (found == false) return false;
            }
        }
        return true;
    }

    public static Set<String> getMethodCallsFromAssert(BytecodeReader br, String scriterion, Set<String> prefix) {
        //get the methods calls from the assertion body
        //System.out.println(scriterion);
        String[] tokens = scriterion.split(":");
        String location = tokens[0];
        String[] location_tokens = location.split("\\.");
        String method_name = location_tokens[location_tokens.length - 1];
        location = location.replaceAll("\\.", "\\/");
        location = location.replaceAll("/" + method_name, "." + method_name);
        String line_no = tokens[1];
        //System.out.println(line_no);
        //System.out.println(location);


        HashMap<String, MethodInfo> lines = br.fromMethodToLineRecords.get(location);

        if (lines != null) {
            MethodInfo info = lines.get(line_no);
            if (info == null) return new HashSet<>();
            ArrayList<String> calls = info.methodCalls;
            ArrayList<String> found = new ArrayList<>();
            for (String call : calls) {
                //if (call.startsWith("org/junit/Assert") || (!call.startsWith("org/joda/time") && !(call.startsWith("org/junit/Assert")))) {
                if (!callFromApplication(call, prefix)) {  //.startsWith("org/apache/commons/csv"))) {
                    found.add(call);
                }
            }
            calls.removeAll(found); //removing all assert calls
            calls.removeAll(info.invokeSpecial); //removing all constructors
            return new HashSet<>(calls);
        } else return null;
    }

    private static boolean callFromApplication(String call, Set<String> prefixes) {

        for (String prefix : prefixes) {
            if (call.startsWith(prefix)) return true;
        }
        return false;
    }

    private static Set<String> readPrefixes(String prefixPath) throws IOException {

        FileReader fr = new FileReader(prefixPath);
        BufferedReader br = new BufferedReader(fr);
        String currentLine = br.readLine();
        Set<String> prefixes = new HashSet<>();

        while (currentLine != null) {
            currentLine = currentLine.trim().replaceAll("\\.", "/");
            prefixes.add(currentLine);
            System.out.println(currentLine);
            currentLine = br.readLine();
        }
        br.close();
        return prefixes;
    }
}
