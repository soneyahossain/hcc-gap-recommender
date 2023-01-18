package util;

import java.io.File;
import java.util.List;

public class Util {
    public static void search(final String pattern, final File testFiles, List<String> result) {

        for (final File f : testFiles.listFiles()) {
            if (f.isDirectory()) {
                search(pattern, f, result);
            }
            if (f.isFile()) {
                if (f.getName().matches(pattern)) {
                    if (f.length() != 0) {
                        result.add(f.getAbsolutePath());
                    }
                }
            }
        }
    }
}






















   /*

     //main is not used
    public static void main(String... args) throws Exception {

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("B", "C", "D", "E", "F"));

        // System.out.println(new Util().intersection(list1, list2));
        // System.out.println(new Util().union(list1, list2));
    }


    public <T> List<T> union(ArrayList<T> list1, ArrayList<T> list2) {

        Set<T> set = new HashSet<T>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<T>(set);
    }

    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();
        for (T t : list1) {
            if (list2.contains(t)) {
                list.add(t);
            }
        }
        return list;
    }
     */