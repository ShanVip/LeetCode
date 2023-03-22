package MergeSimilarItems;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         int[][] items1 = {{1,1},{4,5},{3,8}};
         int[][] items2 = {{3,1},{1,5}};


        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int[] line: items1){
            numbers.put(line[0], line[1]);
        }
        for(int[] line: items2){
            if(numbers.containsKey(line[0]))
            {
                int prev = numbers.get(line[0]);
                numbers.put(line[0], prev+line[1]);
            }
            else
            {
                numbers.put(line[0],line[1]);
            }
        }
        List<List<Integer>> answer =
                new ArrayList<>();

        Map<Integer, Integer> result = numbers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for (int key: result.keySet()) {
//            System.out.println(result.get(key));
            ArrayList<Integer> arrList = new ArrayList<>();
            arrList.add(key);
            arrList.add(result.get(key));
            answer.add(arrList);
        }

        System.out.println(answer);
    }
}