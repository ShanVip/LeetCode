package FindNUniqueIntegersSumuptoZeroEasy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 7;
        int[] sumZero = new int[n];
        

            for (int i = 0; i < sumZero.length/2; i++) {
                sumZero[i]=n/2-i;
            }
            for (int i = sumZero.length-1; i >= sumZero.length/2; i--) {
                sumZero[i]=(n/2-i-1);
            }

        System.out.println(Arrays.toString(sumZero));
        if (n%2>0){
            sumZero[sumZero.length-1]=0;
        }
        System.out.println(Arrays.toString(sumZero));

    }
}
