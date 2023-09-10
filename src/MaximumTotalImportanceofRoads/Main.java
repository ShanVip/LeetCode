package MaximumTotalImportanceofRoads;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       int n = 5;
       int[][] roads = {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < roads.length; i++) {
            for (int j = 0; j < roads[i].length; j++) {
                if(!map.containsKey(roads[i][j])){
                    map.put(roads[i][j], 1);
                }else map.put(roads[i][j], map.get(roads[i][j])+1);
            }
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = map.entrySet()
                .stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .collect(Collectors.toList());

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        int size = sortedEntries.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<Integer, Integer> entry = sortedEntries.get(i);
            sortedMap.put(entry.getKey(), size - i);
        }

        int sum = 0;

        for (int i = 0; i < roads.length; i++) {
            for (int j = 0; j < roads[i].length; j++) {
                sum += sortedMap.get(roads[i][j]);
            }

        }
        System.out.println(sum);

    }
}
