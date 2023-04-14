package NumberofEquivalentDominoPairs;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       int[][] dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        int x = 0;
        for (int i = 0; i < dominoes.length; i++) {
            for (int j = 0; j < dominoes[i].length-1; j++) {
                if (dominoes[i][j]>dominoes[i][j+1]){
                    x = dominoes[i][j];
                    dominoes[i][j]=dominoes[i][j+1];
                    dominoes[i][j+1]=x;
                }
            }
        }
        Arrays.sort(dominoes, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));

        for (int i = 0; i < dominoes.length; i++) {
            System.out.println(Arrays.toString(dominoes[i]));
        }

        x=0;
        for (int i = 0; i < dominoes.length-1; i++) {
            for (int b = i+1; b < dominoes.length; b++) {
                    if(dominoes[i][0]==dominoes[b][0] && dominoes[i][1]==dominoes[b][1]){
                        x++;
                    }else break;
            }
        }
        System.out.println(x);
    }
}

