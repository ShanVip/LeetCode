package FindthePrefixCommonArrayofTwoArrays;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] A = {2,3,1};
        int[] B = {3,1,2};

        int[] answer = new int[B.length];

        int counter = 0;

        HashMap<Integer, Integer> hashMapA = new HashMap<>();
        HashMap<Integer, Integer> hashMapB = new HashMap<>();


        for (int i = 0; i < A.length ; i++) {

                   hashMapA.put(A[i], 0);
                   hashMapB.put(B[i], 0);
                   for(int key : hashMapA.keySet()){
                       if (hashMapB.containsKey(key)){
                           counter++;
                       }
                   }
                   answer [i] = counter;
                   counter = 0;


        }

        System.out.println(Arrays.toString(answer));
    }
}
