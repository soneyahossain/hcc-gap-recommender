package hcc;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CloverHandler {
    static boolean print_logger = false;


    public static void main(String[] args) throws Exception {
        String clover_cov_dir = "clover.xml";
        CloverHandler ch = new CloverHandler();
        HashMap<String, StmtCov> sc_per_method = new HashMap<>();  //class, stats
        HashMap<String, StmtCov> sc_per_class = new HashMap<>();   //method, stats
        Set<String> all_executed_stmts = new HashSet<>(); //all statements
        ch.getCloverCov(clover_cov_dir, sc_per_class, sc_per_method, all_executed_stmts);//
        ch.printCoverage(sc_per_class, sc_per_method, "out");
        System.out.println(all_executed_stmts.size());
    }

    public int printCoverage(HashMap<String, StmtCov> sc_per_class, HashMap<String, StmtCov> sc_per_method, String outDir) {


        int total_covered_stmts = 0;
        int total_missed_stmts = 0;

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File(outDir + "/" + "sc_per_method.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "method,missed_stmt,covered_stmt,total_stmts";

        builder.append(columnNamesList + "\n");

        for (String m_name : sc_per_method.keySet()) {
            StmtCov entry = sc_per_method.get(m_name);
            total_covered_stmts += entry.getTotalCovStmt();
            total_missed_stmts += entry.getTotalMissedStmt();
            builder.append(m_name + "," + entry.getTotalMissedStmt() + "," + entry.getTotalCovStmt() + "," + entry.total() + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        System.out.println("coverage: missed statements: " + total_missed_stmts + ", executed statements:" + total_covered_stmts + ", total:" + (total_missed_stmts + total_covered_stmts));

        total_covered_stmts = 0;
        total_missed_stmts = 0;

        pw = null;
        try {
            pw = new PrintWriter(new File(outDir + "/" + "sc_per_class.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        builder = new StringBuilder();
        columnNamesList = "class,missed_stmt,covered_stmt,total_stmt";

        builder.append(columnNamesList + "\n");

        for (String c_name : sc_per_class.keySet()) {
            StmtCov entry = sc_per_class.get(c_name);
            total_covered_stmts += entry.getTotalCovStmt();
            total_missed_stmts += entry.getTotalMissedStmt();
            builder.append(c_name + "," + entry.getTotalMissedStmt() + "," + entry.getTotalCovStmt() + "," + entry.total() + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        System.out.println("coverage: missed statements: " + total_missed_stmts + ", executed statements:" + total_covered_stmts + ", total:" + (total_missed_stmts + total_covered_stmts));
        return total_missed_stmts;
    }


    public void getCloverCov(String clover_cov_dir, HashMap<String, StmtCov> sc_per_class, HashMap<String, StmtCov> sc_per_method, Set<String> all_executed_stmts) {
        try {
            File fXmlFile = new File(clover_cov_dir);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            if (print_logger) System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList pkgList = doc.getElementsByTagName("package");
            if (print_logger) System.out.println("number of packages:" + pkgList.getLength());

            //iterate for files
            for (int j = 0; j < pkgList.getLength(); j++) {  // for each pkg

                Node pkg = pkgList.item(j);
                String pkg_name = pkg.getAttributes().getNamedItem("name").getNodeValue();
                if (print_logger) System.out.println("pkg_name:" + pkg_name);
                NodeList fList = pkg.getChildNodes(); // pkg child

                for (int k = 0; k < fList.getLength(); k++) {
                    Node fNode = fList.item(k); //get each child
                    if (fNode.getNodeName() != null && fNode.getNodeName().equals("file")) { //check if the child is a file

                        String class_name = fNode.getAttributes().getNamedItem("name").getNodeValue();
                        class_name = pkg_name + "." + class_name;
                        class_name = class_name.substring(0, class_name.indexOf(".java"));
                        if (print_logger) System.out.println("outer class: " + class_name);


                        NodeList child_nodes = fNode.getChildNodes(); //  getting all child nodes from a file
                        ArrayList<String> classes = new ArrayList<>();


                        //--------------------------these values will be reset
                        String method_name = null;
                        Set<String> all_cov_stmt_in_class = new HashSet<>();
                        Set<String> all_missed_stmt_in_class = new HashSet<>();

                        Set<String> all_cov_stmt_in_method = new HashSet<>();
                        Set<String> all_missed_stmt_in_method = new HashSet<>();
                        //--------------------------------these values will be reset

                        for (int i = 0; i < child_nodes.getLength(); i++) {

                            Node child = child_nodes.item(i);
                            String node_type = child.getNodeName();

                            /*
                            this block is necessary to change class constructor to <init>
                            example: <class name="ImpreciseDateTimeField.LinkedDurationField">
                            signature="ImpreciseDateTimeField(DateTimeFieldType,long)"/>
                            */

                            if (node_type != null && node_type.equals("class")) {
                                String className = child.getAttributes().getNamedItem("name").getNodeValue();
                                if (className.indexOf(".") != -1) {
                                    className = className.substring(className.indexOf("."));
                                    classes.add(className);
                                } else {
                                    classes.add(className);
                                }
                            }

                            if (node_type != null && node_type.equals("line")) {
                                Node stmt_type = child.getAttributes().getNamedItem("type");

                                //if method signature then get the total statements inside it
                                if (stmt_type.getNodeValue().contains("method")) {

                                    if (method_name != null) //there were already a method
                                    {
                                        //insert the previous method record in map
                                        method_name = class_name + "." + method_name;
                                        StmtCov mc = sc_per_method.get(method_name);
                                        if (mc == null) {
                                            mc = new StmtCov();
                                            sc_per_method.put(method_name, mc);
                                        }
                                        mc.covered_stmts.addAll(all_cov_stmt_in_method);
                                        mc.missed_stmts.addAll(all_missed_stmt_in_method);

                                        //add to class set
                                        all_cov_stmt_in_class.addAll(all_cov_stmt_in_method);
                                        all_missed_stmt_in_class.addAll(all_missed_stmt_in_method);

                                        //reset method set
                                        all_cov_stmt_in_method = new HashSet<>();
                                        all_missed_stmt_in_method = new HashSet<>();
                                    }


                                    method_name = child.getAttributes().getNamedItem("signature").getNodeValue();
                                    method_name = method_name.substring(0, method_name.indexOf("("));
                                    if (classes.contains(method_name)) method_name = "<init>";

                                }

                                if (stmt_type.getNodeValue().contains("stmt")) {
                                    String line_num = child.getAttributes().getNamedItem("num").getNodeValue();
                                    String count = child.getAttributes().getNamedItem("count").getNodeValue();
                                    String location = class_name + "." + method_name + ":" + line_num;

                                    if (!count.equals("0")) {
                                        all_executed_stmts.add(location);
                                        all_cov_stmt_in_method.add(location);

                                    } else all_missed_stmt_in_method.add(location);
                                }
                            }
                        }

                        //insert the last method in map
                        method_name = class_name + "." + method_name;
                        StmtCov mc = sc_per_method.get(method_name);
                        if (mc == null) {
                            mc = new StmtCov();
                            sc_per_method.put(method_name, mc);
                        }

                        mc.covered_stmts.addAll(all_cov_stmt_in_method);
                        mc.missed_stmts.addAll(all_missed_stmt_in_method);
                        all_cov_stmt_in_class.addAll(all_cov_stmt_in_method);
                        all_missed_stmt_in_class.addAll(all_missed_stmt_in_method);

                        //insert the class in map
                        StmtCov cc = sc_per_class.get(class_name);
                        if (cc == null) {
                            cc = new StmtCov();
                            sc_per_class.put(class_name, cc);
                        }
                        cc.covered_stmts.addAll(all_cov_stmt_in_class);
                        cc.missed_stmts.addAll(all_missed_stmt_in_class);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class StmtCov {

        public Set<String> covered_stmts = new HashSet<>();
        public Set<String> missed_stmts = new HashSet<>();

        public int total() {
            return covered_stmts.size() + missed_stmts.size();
        }

        public int getTotalCovStmt() {
            return covered_stmts.size();
        }

        public int getTotalMissedStmt() {
            return missed_stmts.size();
        }

        public float getCoverage() {
            return ((float) getTotalCovStmt() / (float) total()) * 100;
        }
    }
}
