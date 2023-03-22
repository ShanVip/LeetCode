package PascalTriangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        if(n==0){
            return;
        }

        int[] prev = new int[n+1];
        int[] fut = new int[n+1];

        prev[0]=1;
        prev[1]=1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i ; j++) {
                if (j==i || j==0){
                    fut[j]=1;
                }else{
                    fut[j]=prev[j]+prev[j-1];
                }
            }
            prev = Arrays.copyOf(fut, fut.length);
        }
        System.out.println(Arrays.toString(fut));

    }
}
