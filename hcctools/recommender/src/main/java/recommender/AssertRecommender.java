package recommender;

import bytecodeparser.BytecodeReader;
import bytecodeparser.MethodInfo;
import callgraph.Graph;

import java.util.*;

public class AssertRecommender {

    BytecodeReader reader;
    Queue<String> superClasses = new LinkedList<>();
    Queue<String> innerClasses = new LinkedList<>();

    public AssertRecommender(String filePath) throws Exception {

        //start: class read, parse, and print
        reader = new BytecodeReader();//methodToLineNumbersMap, fieldToMethodsRead, fieldToMethodsWrite, superclasses, innerClasses, fromClassToMethod, fromClassToSuper, fromMethodToWriteFields, fromMethodToReturn);
        reader.readClass(filePath);
        reader.readClass(superClasses, filePath);
        reader.readClass(innerClasses, filePath);
    }

    public BytecodeReader getReader() {
        return reader;
    }

    public Set<String> recommendAssertions(String method, String lineNo) {
        //find what this line does read? or write ?
        Set<String> recommendations = new HashSet<>();
        String recommendation = "";

        //returns all lines with read+write+method calls
        HashMap<String, MethodInfo> methodRecord = reader.fromMethodToLineRecords.get(method);
        MethodInfo lineRecord;
        if (methodRecord != null) {
            lineRecord = methodRecord.get(lineNo);
            if (lineRecord == null) {
                //System.out.println("lineRecord null for "+method+" line no "+lineNo);
                return null;
            }
        } else {
            //System.out.println("No record found for the method");
            return null;
        }


        //case 1: only writes the values [mostly fields], no read
        //find non-void methods that reads these values, sort based on distance from return value
        if (lineRecord.readFields.size() == 0 && lineRecord.writeFields.size() != 0) {
            recommendation += "case 1:\n";
            for (String field : lineRecord.writeFields) {
                //find non-void methods that reads these fields
                List<String> methods = reader.fromFieldToMethodsThatRead.get(field);
                if (methods != null && methods.size() != 0) {
                    //recommendation += "add assertions to :" + methods.toString() + "\n";
                    recommendations.addAll(methods);
                }
            }
        }//End: case:1

        //case 2: only reads the value
        // if the method is void, no way it can influence oracle
        // if non-void, there is still chance to influence if assertion is added.

        if (lineRecord.readFields.size() != 0 && lineRecord.writeFields.size() == 0) {
            recommendation += "case 2:\n";
            for (String field : lineRecord.readFields) {
                //find other non-void methods that reads these fields
                List<String> methods = reader.fromFieldToMethodsThatRead.get(field);

                if (methods != null && methods.size() != 0) {
                    if (methods.contains(method))
                        //recommendation += "add assertions to :" + method + "\n";
                        recommendations.add(method.toString());
                }
            }
        }//End: case:2

        //case 3: both reads and writes
        //case 3-1: first reads and then writes, e.g,  this.width = 2*this.width;
        //case 3-2: first writes and then read  // not sure if possible in the same line,
        if (lineRecord.readFields.size() != 0 && lineRecord.writeFields.size() != 0) {
            recommendation += "case 3: \n";
            for (String field : lineRecord.writeFields) {
                //find other non-void methods that reads these fields
                List<String> methods = reader.fromFieldToMethodsThatRead.get(field);

                if (methods != null && methods.size() != 0) {
                    //recommendation += "add assertions to:" + methods.toString() + "\n";
                    recommendations.addAll(methods);

                }
            }
        }//End: case:3

        //case:4 the line contains a method call   ---> the most interesting case
        //find what fields it writes
        //find what other methods reads these fields
        if (lineRecord.methodCalls.size() != 0) {
            recommendation += "case 4: \n";
            for (String methodCall : lineRecord.methodCalls) {

                String class_name = methodCall.split("\\.")[0];
                if (class_name.contains("$")) class_name = class_name.substring(0, class_name.indexOf("$"));
                String m_name = methodCall.split("\\.")[1];
                boolean foundMethod = false;
                //System.out.println("DEBUG:"+methodCall);
                //System.out.println(class_name); System.out.println(m_name);
                //get list of methods from this class, if not found search the super class and fetch from there
                ArrayList<String> methods = reader.fromClassToMethod.get(class_name);
                //if(methods==null) System.out.println("null....................");

                if (methods != null && methods.contains(m_name)) {
                    foundMethod = true;
                    //System.out.println("method found....................");

                    //now find what fields this method writes
                    //find other methods that read those field
                    //add assertion
                } else {
                    //System.out.println("looking from super class");
                    String superClass = reader.fromClassToSuper.get(class_name);
                    if (superClass != null) {
                        ArrayList<String> methodsFromSuperClass = reader.fromClassToMethod.get(superClass);
                        if (methodsFromSuperClass != null && methodsFromSuperClass.contains(m_name)) {
                            class_name = superClass;
                            foundMethod = true;
                        }
                    }
                }

                if (foundMethod) {
                    ArrayList<String> fieldsWritten = reader.fromMethodToWriteFields.get(class_name + "." + m_name);
                    if (fieldsWritten != null) {
                        for (String field : fieldsWritten) {
                            //find other non-void methods that reads these fields
                            //System.out.println("here:"+field);
                            List<String> methodReadingThisField = reader.fromFieldToMethodsThatRead.get(field);
                            if (methodReadingThisField != null && methodReadingThisField.size() != 0) {
                                recommendations.addAll(methodReadingThisField);
                                //recommendation += "Call "+method+" first then add assertions to:" + methodReadingThisField.toString() + "\n";
                            }
                        }
                    }
                }
            }
        }

        if (reader.fromMethodToReturn.get(method) != null) {
            recommendations.add(method);
        }

        //End: case:4
        if (recommendations.size() == 0) return null;
        else return recommendations;
    }


    public Set<String> lc_recommendations(Set<Set<String>> recommendations_) { //this is kind of a "Least Common subset" type thing,

        Set<String> simplified_rec = new HashSet<>();

        for (Set<String> rec : recommendations_) {
            if (rec.size() == 1) {
                simplified_rec.addAll(rec);
            }
        }

        for (Set<String> rec : recommendations_) {
            if (rec.size() > 1) {
                boolean found = false;
                for (String rec_from_rec : rec) {
                    if (simplified_rec.contains(rec_from_rec)) {
                        //found one the method already in the simplified list, so ignore
                        found = true;
                        break;
                    }
                }
                if (!found) simplified_rec.add(rec.iterator().next());
            }
        }
        return simplified_rec;
    }

    public boolean isPerfectMatched(Set<String> recommendations, Set<String> methodCalls) {

        if (recommendations.size() == methodCalls.size()) {
            for (String call : methodCalls) {
                if (!recommendations.contains(call)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Set rank_recommendations(Set<String> recommendations, HashMap<String, Set<String>> callgraph, Set<String> topN, int top_n) {

        ArrayList<String> rList = new ArrayList<>(recommendations);

        //------------------------------graph construction
        HashMap<String, Integer> fromRecoToID = new HashMap<>();
        HashMap<Integer, String> fromIDToReco = new HashMap<>();
        Graph g = new Graph(recommendations.size());
        for (int i = 0; i < rList.size(); i++) {
            fromRecoToID.put(rList.get(i), i);
            fromIDToReco.put(i, rList.get(i));
        }
        /* logging
        for (Integer id : fromIDToReco.keySet()) {
            System.out.println(id+", "+fromIDToName.get(id));
        }
        */

        Set<String> vertexInGraph = new HashSet<>();
        for (int i = 0; i < rList.size() - 1; i++) {
            for (int j = i + 1; j < rList.size(); j++) {

                if (callgraph.get(rList.get(i)) != null) {
                    if (callgraph.get(rList.get(i)).contains(rList.get(j))) {
                        //add new edge
                        g.addEdge(fromRecoToID.get(rList.get(i)), fromRecoToID.get(rList.get(j)));
                        vertexInGraph.add(rList.get(i));
                        vertexInGraph.add(rList.get(j));

                    }
                }
                if (callgraph.get(rList.get(j)) != null) {
                    if (callgraph.get(rList.get(j)).contains(rList.get(i))) {
                        //add new edge
                        g.addEdge(fromRecoToID.get(rList.get(j)), fromRecoToID.get(rList.get(i)));
                        vertexInGraph.add(rList.get(i));
                        vertexInGraph.add(rList.get(j));
                    }
                }
            }
        }

        //logging
        //g.print();
        //------------------------------graph construction complete.......................

        //now if there is at least one edge we can rank, otherwise there is no way ti rank
        if (vertexInGraph.size() > 0) {
            //running BFS and sorting the recommendation based on the maximum number of method calls reached from each node

            Set<String> set = new LinkedHashSet();
            HashMap<String, Integer> ranking = new HashMap<>();

            for (int i = 0; i < recommendations.size(); i++) {
                //System.out.println(i+", "+count);
                ranking.put(fromIDToReco.get(i), g.BFS(i));
                //System.out.println();
            }

            Map<String, Integer> sorted_ranking = sortByValue(ranking);

            //now iterate the map to get the max value and
            int i = 0;
            for (Map.Entry<String, Integer> en : sorted_ranking.entrySet()) {
                set.add(en.getKey());
                if (i < top_n) {
                    topN.add(en.getKey());
                    i++;
                }
                //System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
            }
            return set;
        } else {
            topN.addAll(recommendations);  // in this case topN will be same as the recommendation
            return recommendations;
        }
    }

    private HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
