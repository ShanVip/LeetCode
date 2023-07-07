package CanMakeArithmeticProgressionFromSequence;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        Arrays.sort(arr);
        int buffer = arr[1]-arr[0];
        boolean answer = true;
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] - arr[i-1] != buffer){
               answer = false;
               break;
           }
        }

        System.out.println(answer);
        
    }
}
