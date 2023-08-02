package IntersectionofTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i])+1);
            }else map1.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map2.containsKey(nums2[i])){
                map2.put(nums2[i], map1.get(nums2[i])+1);
            }else map2.put(nums2[i], 1);
        }

        for (int key : map1.keySet()) {
            if (map2.containsKey(key)){
                for (int i = 0; i < Math.min(map1.get(key), map2.get(key)); i++) {
                    answer.add(key);
                }
            }
        }

        int[] answerTotal = new int[answer.size()];

        for (int i = 0; i < answerTotal.length; i++) {
            answerTotal[i] = answer.remove(0);
        }

        System.out.println(Arrays.toString(answerTotal));



    }
}
