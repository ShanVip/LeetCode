package TestingForGroovy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, Integer> countElements(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countElements(arr);
        System.out.println(result);
    }
}


//Решение на Groovy
//def countElements(arr) {
//    def elementCountMap = [:]
//
//    arr.each { element ->
//            elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
//    }
//
//    return elementCountMap
//}
//
//    def arr = [1, 3, 4, 5, 1, 5, 4]
//        def result = countElements(arr)
//        println result
