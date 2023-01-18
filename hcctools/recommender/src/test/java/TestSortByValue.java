package test.java;

import java.util.*;

public class TestSortByValue {

    public static void main(String args[])
    {

        HashMap<String, Integer> ranking = new HashMap<>();
        ranking.put("a", 400);ranking.put("ab", 40);ranking.put("ac", 40);ranking.put("ad", 14);ranking.put("ba", 45);
        Map<String, Integer> sorted_ranking = sortByValue(ranking);

        //now iterate the map to get the max value and
        int i = 0;
        for (Map.Entry<String, Integer> en : sorted_ranking.entrySet()) {

            System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
        }

    }

    private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
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
