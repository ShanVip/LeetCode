package DetermineWhetherMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};

       int[][] helper = new int[mat.length][mat[0].length];
       int[][] helperVertical = new int[mat.length][mat[0].length];

        for (int i = 0; i < helperVertical.length / 2 ; i++) {
            helperVertical[i] = mat[(helperVertical.length-1) - i];
            helperVertical[(helperVertical.length-1) - i] = mat[i];
        }

        for (int i = 0; i < helperVertical.length; i++) {
            System.out.println(Arrays.toString(helperVertical[i]));
            System.out.println(3/2);
        }


        for (int i = 0; i < mat[0].length; i++) {
            int[] buffer = new int[mat.length];
            for (int j = 0; j < mat.length; j++) {
                buffer[j] = mat[j][i];
            }
            helper[i] = buffer;
        }

        for (int i = 0; i < helper[0].length / 2; i++) {
            int count;
            for (int j = 0; j < helper.length; j++) {
                count = helper[j][i];
                helper[j][i] = helper[j][(helper[0].length - 1) - i];
                helper[j][(helper[0].length - 1) - i] = count;
            }
        }

        for (int i = 0; i < helper.length; i++) {
            System.out.println(Arrays.toString(helper[i]));
        }


    }
}
