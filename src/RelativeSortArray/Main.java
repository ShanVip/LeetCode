package RelativeSortArray;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        Arrays.sort(arr1);
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();


        for (int i = 0; i < arr1.length; i++) {
            if (hashMap.containsKey(arr1[i])) {
                int count = hashMap.get(arr1[i]);
                hashMap.put(arr1[i], count + 1);
            } else {
                hashMap.put(arr1[i], 1);
            }
        }
        int counter = 0;
        for (int i = 0; i < arr2.length; i++) {
            int count = hashMap.get(arr2[i]);
            while (count != 0){
                arr1[counter]=arr2[i];
                hashMap.put(arr2[i], count - 1);
                counter++;
                count--;
            }
        }
        for (int key : hashMap.keySet()) {
            int count = hashMap.get(key);
            while (count != 0){
                arr1[counter]=key;
                hashMap.put(key, count - 1);
                counter++;
                count--;
            }
            System.out.println(key);
        }

        System.out.println(Arrays.toString(arr1));
    }
}


