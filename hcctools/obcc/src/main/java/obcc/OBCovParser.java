package obcc;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.HashMap;

public class OBCovParser {

    static boolean print_logger = false;
    private int total_conditions = 0;
    private int total_missed = 0;
    private int total_covered = 0;


    public static void main(String[] args) throws Exception {
        String jacoco_xml = "jacoco.xml";
        HashMap<String, OBranchCov> jacoco_per_method_cov = new HashMap<>();
        HashMap<String, OBranchCov> jacoco_per_class_cov = new HashMap<>();
        new OBCovParser().getJacocoCov(jacoco_xml, jacoco_per_method_cov, jacoco_per_class_cov);
        new OBCovParser().printCSV(jacoco_per_method_cov, jacoco_per_class_cov, "out");
    }

    public void getJacocoCov(String file_path, HashMap<String, OBranchCov> jacoco_per_method_cov, HashMap<String, OBranchCov> jacoco_per_class_cov) {
        try {
            File jacoco = new File(file_path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            dBuilder.setEntityResolver(new EntityResolver() {
                @Override
                public InputSource resolveEntity(String publicId, String systemId)
                        throws SAXException, IOException {
                    if (systemId.contains("report.dtd")) {
                        return new InputSource(new ByteArrayInputStream("<?xml version='1.0' encoding='UTF-8'?>".getBytes()));
                    } else
                        return null;
                }
            });

            Document doc = dBuilder.parse(jacoco);
            doc.getDocumentElement().normalize();
            if (print_logger) System.out.println("Root element :" + doc.getDocumentElement().getNodeName());


            NodeList packageList = doc.getElementsByTagName("package");//get all packages
            if (print_logger) System.out.println("number of packages:" + packageList.getLength());

            //iterate each package
            for (int j = 0; j < packageList.getLength(); j++) {

                Node package_ = packageList.item(j);
                String package_name = package_.getAttributes().getNamedItem("name").getNodeValue();
                if (print_logger) System.out.println("package_name :" + package_name);
                NodeList packageChildren = package_.getChildNodes(); // pkg child

                for (int k = 0; k < packageChildren.getLength(); k++) {

                    Node packageChild = packageChildren.item(k); //get each child
                    if (packageChild.getNodeName() != null && packageChild.getNodeName().equals("class")) { //only if class node

                        Node classNode = packageChild;
                        String class_name = classNode.getAttributes().getNamedItem("name").getNodeValue();
                        class_name = class_name.replaceAll("/", ".");

                        //if(class_name.contains("$")) class_name=class_name.substring(0, class_name.indexOf("$"));

                        if (print_logger) System.out.println("class_name: " + class_name);

                        NodeList classChildren = classNode.getChildNodes(); //getting all method nodes from a class
                        for (int c = 0; c < classChildren.getLength(); c++) {
                            Node classChild = classChildren.item(c);

                            //System.out.println("class_name: " + class_name+", node:"+classChildren.getLength());
                            //if child is a method

                            if (classChild.getNodeName() != null && classChild.getNodeName().equals("method")) {

                                //iterate all children
                                Node method = classChild;
                                NodeList methodChildren = method.getChildNodes();

                                String method_name = method.getAttributes().getNamedItem("name").getNodeValue();
                                method_name = class_name + "." + method_name;
                                //System.out.println("method_name: " + method_name);

                                OBranchCov method_record = jacoco_per_method_cov.get(method_name);
                                if (method_record == null) {
                                    method_record = new OBranchCov();
                                    jacoco_per_method_cov.put(method_name, method_record);
                                }//else throw new Exception("Jacoco parsing error"); this would cause trouble for overloaded methods

                                for (int m = 0; m < methodChildren.getLength(); m++) {
                                    Node methodChild = methodChildren.item(m);
                                    Node type = methodChild.getAttributes().getNamedItem("type");
                                    if (type.getNodeValue().contains("BRANCH")) {

                                        int missed_branch = Integer.parseInt(methodChild.getAttributes().getNamedItem("missed").getNodeValue());
                                        int covered_branch = Integer.parseInt(methodChild.getAttributes().getNamedItem("covered").getNodeValue());
                                        method_record.covered_conds += covered_branch;
                                        method_record.missed_conds += missed_branch;
                                    }
                                }
                            } else if (classChild.getNodeName() != null && classChild.getNodeName().equals("counter")) {

                                Node type = classChild.getAttributes().getNamedItem("type");

                                if (type.getNodeValue().contains("BRANCH")) {
                                    //insert in the class map

                                    OBranchCov class_record = jacoco_per_class_cov.get(class_name);
                                    if (class_record == null) {
                                        class_record = new OBranchCov();
                                        jacoco_per_class_cov.put(class_name, class_record);
                                    }
                                    //else throw new Exception("Jacoco parsing error"); this would cause trouble for overloaded methods

                                    int missed_branch = Integer.parseInt(classChild.getAttributes().getNamedItem("missed").getNodeValue());
                                    int covered_branch = Integer.parseInt(classChild.getAttributes().getNamedItem("covered").getNodeValue());
                                    class_record.covered_conds += covered_branch;
                                    class_record.missed_conds += missed_branch;
                                }
                            }

                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void printCSV(HashMap<String, OBranchCov> jacoco_per_method_cov, HashMap<String, OBranchCov> jacoco_per_class_cov, String outdir) throws IOException {


        int total_covered_branch = 0;
        int total_missed = 0;

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File(outdir + "/" + "obc_per_method.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "method, missed_branch, covered_branch, total_branch";

        builder.append(columnNamesList + "\n");

        for (String m_name : jacoco_per_method_cov.keySet()) {
            OBranchCov entry = jacoco_per_method_cov.get(m_name);
            total_covered_branch += entry.covered_conds;
            total_missed += entry.missed_conds;
            builder.append(m_name + "," + entry.missed_conds + "," + entry.covered_conds + "," + (entry.covered_conds + entry.missed_conds) + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        //.println("done!" + total_missed + "," + total_covered_branch + " " + (total_missed + total_covered_branch));

        total_covered_branch = 0;
        total_missed = 0;

        pw = null;
        try {
            pw = new PrintWriter(new File(outdir + "/" + "obc_per_class.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        builder = new StringBuilder();
        columnNamesList = "class, missed_branch, covered_branch, total_branch";

        builder.append(columnNamesList + "\n");

        for (String c_name : jacoco_per_class_cov.keySet()) {
            OBranchCov entry = jacoco_per_class_cov.get(c_name);
            total_covered_branch += entry.covered_conds;
            total_missed += entry.missed_conds;

            builder.append(c_name + "," + entry.missed_conds + "," + entry.covered_conds + "," + (entry.covered_conds + entry.missed_conds) + "\n");
        }
        pw.write(builder.toString());
        pw.close();
        this.total_conditions = total_missed + total_covered_branch;
        this.total_covered = total_covered_branch;
        this.total_missed = total_missed;
        //System.out.println("done!" + total_missed + "," + total_covered_branch + " " + (total_missed + total_covered_branch));
    }

    public double getOBC() {
        return ((double) total_covered / (double) total_conditions) * 100;
    }

    public int getTotalConditions() {
        return this.total_conditions;
    }

    public int getTotalExecutedConditions() {
        return this.total_covered;
    }

    public int getTotalMissedConditions() {
        return this.total_missed;
    }

    class OBranchCov {

        public int covered_conds;
        public int missed_conds;

        public int getTotalConds() {
            return covered_conds + missed_conds;
        }

        public float getCoverage() {
            return ((float) covered_conds / (float) getTotalConds()) * 100;
        }
    }
}

