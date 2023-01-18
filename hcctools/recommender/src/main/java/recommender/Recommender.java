package recommender;

import callgraph.CallGraphBuilder;
import org.apache.commons.io.FileUtils;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Recommender {
    public static int top_n=5;

    public static void main(String args[]) throws Exception {

        //--------------unchecked_stmts process--------------------
        if (args.length == 0)
            throw new IllegalArgumentException("insufficient parameters! param 1: unchecked_statement.txt, param2: source class target dir");

        String u_stmt_file = args[0];
        if (u_stmt_file.endsWith("/"))
            u_stmt_file= u_stmt_file.substring(0,u_stmt_file.length()-1);
        String sourcePath = args[1];
        if (!sourcePath.endsWith("/"))
            sourcePath= sourcePath+"/";
        String out_dir = args[2];
        if (out_dir.endsWith("/"))
            out_dir= out_dir.substring(0,out_dir.length()-1);
        //--------------------------------------------------------------


        Path path = Paths.get(out_dir);
        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("output dir created");
        } else {
            System.out.println("output dir exists, cleaning directory");
            FileUtils.cleanDirectory(new File(out_dir));
        }
//---------------------------------------------------------------------------

        HashMap<String, Set<Set<String>>> fromClassToRecommendation = new HashMap<>();

        File unchecked_stmts = new File(u_stmt_file);
        AssertRecommender ar = new AssertRecommender(sourcePath);
        CallGraphBuilder cgb = new CallGraphBuilder(); //building the call graph for the whole source
        HashMap<String, Set<String>> CallGraph = cgb.buildCallGraph(sourcePath,out_dir);

        try (BufferedReader br = new BufferedReader(new FileReader(unchecked_stmts))) {
            String line;

            while ((line = br.readLine()) != null) {

                if (!line.contains("org.joda.time.chrono.")) continue;

                String[] tokens = line.split(":");
                String location = tokens[0];
                String className = location.substring(0,location.lastIndexOf("."));

                String[] location_tokens = location.split("\\.");
                String method_name = location_tokens[location_tokens.length - 1];
                location = location.replaceAll("\\.", "\\/");
                location = location.replaceAll("/" + method_name, "." + method_name);

                String line_no = tokens[1];

                Set<String> recommendation = ar.recommendAssertions(location, line_no);
                if(recommendation!=null ) {
                    //putting all recommendations in a map
                    Set<Set<String>> reco_for_class = fromClassToRecommendation.get(className);
                    if(reco_for_class==null){
                        reco_for_class = new HashSet<>();
                        fromClassToRecommendation.put(className, reco_for_class);
                    }
                    reco_for_class.add(recommendation);
                }
            }

            //now, for all class, do simplification and write in a file
            for(String class_: fromClassToRecommendation.keySet())
            {
                Set<Set<String>> recommendations_ = fromClassToRecommendation.get(class_);

                Set<String> recommendations = ar.lc_recommendations(recommendations_);
                Set<String> topN = new LinkedHashSet();
                Set<String> rankedR = ar.rank_recommendations(recommendations, CallGraph, topN, top_n);

                if (rankedR != null && rankedR.size() != 0) {

                    String file_name = out_dir+"/"+class_+".txt";
                    File f = new File(file_name);
                    PrintWriter out;

                    if (f.exists() && !f.isDirectory()) {
                        out = new PrintWriter(new FileOutputStream(file_name, true));
                    } else {
                        out = new PrintWriter(file_name);
                    }
                    for (String rec : rankedR) {
                        out.append(rec + "\n");
                    }
                    out.close();
                }
            }
        }
    }

    //System.out.println(ar.RecommendAssertions("org/joda/time/chrono/ISOYearOfEraDateTimeField.<init>", "48"));
}



