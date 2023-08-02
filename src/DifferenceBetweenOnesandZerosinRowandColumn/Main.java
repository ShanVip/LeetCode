package DifferenceBetweenOnesandZerosinRowandColumn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};

        int answer[][] = new int[grid.length][grid[0].length];
        int column[] = new int[grid.length];
        int row[] = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++)
        {
            int s = 0,p = 0;
            for(int j = 0;j < grid[0].length; j++)
            {
                if(grid[i][j] == 0)
                {
                    s++;
                }
                else
                {
                    p++;
                }
            }
            column[i]=p-s;
        }

        for(int i=0;i<grid[0].length;i++)
        {
            int s=0,p=0;
            for(int j=0;j<grid.length;j++)
            {
                if(grid[j][i] == 0)
                {
                    s++;
                }
                else
                {
                    p++;
                }
            }
            row[i] = p - s;
        }
        for(int i = 0; i < grid.length; i++)
        {
            for(int j=0; j < grid[0].length;j++)
            {
                answer[i][j] = row[i]+column[j];
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}