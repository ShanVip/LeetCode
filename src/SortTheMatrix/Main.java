package SortTheMatrix;

public class Main {
    public static void main(String[] args) {

        int[][]  mat = {
                        {3,3,1,1},
                        {2,2,1,2},
                        {1,1,1,2}
                        };


        sortArray(mat);
//        int buffer = 0;
//        for (int i = 0; i < mat.length-1; i++) {
//            for (int j = 0; j < mat[i].length-1; j++) {
//                if(mat[i][j]>mat[i+1][j+1]){
//                    buffer = mat[i][j];
//                    mat[i][j] = mat[i+1][j+1];
//                    mat[i+1][j+1] = buffer;
//                }
//            }
//        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void sortArray(int[][] mat) {
        boolean sorted = true;

        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = 0; j < mat[i].length - 1; j++) {
                if (mat[i][j] > mat[i + 1][j + 1]) {
                    int buffer = mat[i][j];
                    mat[i][j] = mat[i + 1][j + 1];
                    mat[i + 1][j + 1] = buffer;
                    sorted = false;
                }
            }
        }

        if (!sorted) {
            sortArray(mat);
        }
    }
}
