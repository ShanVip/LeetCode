package LargestLocalValuesinaMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};

        int[][] answer = new int[grid.length-2][grid[0].length-2];

        int max = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < grid.length-1; i++) {
            for (int j = 1; j < grid[i].length-1; j++) {
                max = grid[i][j];

              if (max < grid[i][j+1]){
                  max = grid[i][j+1];
              }
              if (max < grid[i][j-1]){
                    max = grid[i][j-1];
                }
             if (max < grid[i+1][j]){
                  max = grid[i+1][j];
              }
              if (max < grid[i-1][j]){
                  max = grid[i-1][j];
              }
               if (max < grid[i+1][j+1]){
                  max = grid[i+1][j+1];
              }
               if (max < grid[i+1][j-1]){
                  max = grid[i+1][j-1];
              }
               if (max < grid[i-1][j+1]){
                  max = grid[i-1][j+1];
              }
               if (max < grid[i-1][j-1]){
                   max = grid[i-1][j-1];
              }

                answer[i-1][j-1] = max;

            }
        }


        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}
