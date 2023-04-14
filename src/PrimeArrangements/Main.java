package PrimeArrangements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n];

        int count = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if ( n > 0){
                arr[i]=n;
                n--;
            }
            if (isPrime(arr[i])==true){
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


