package Convert1DArrayInto2DArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {1,2};
        int m = 2, n = 2;

        int[][] answer = new int[m][n];

        if (m*n != original.length){
            System.out.println(answer);
        } else {
            int row = 0;
            int column = 0;
            for (int i = 0; i < original.length; i++) {
                answer[row][column] = original[i];
                       if (column < n-1){
                           column++;
                       } else {
                           column=0;
                           row++;
                       }
            }

        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после вывода каждой строки массива
        }

    }
}
