package TransposeMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = new int[matrix[0].length][matrix.length];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    ans[row][col] = matrix[i][j];

                    row++;

                    if (row % ans.length == 0) {
                        row = 0;
                        col++;
                    }
                }
            }

            System.out.println(ans);

    }
}