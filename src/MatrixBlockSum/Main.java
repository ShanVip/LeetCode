package MatrixBlockSum;

public class Main {
    public static void main(String[] args) {
        int[][] mat = { {1,2,3},
                        {4,5,6},
                        {7,8,9} };
        int k = 1;

        int sum = 0;

        int answer[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int rowStart = i-k;
                int rowEnd = i+k;
                int colStart = j-k;
                int colEnd = j+k;

                if(rowStart < 0) {
                    rowStart = 0;
                }

                if(rowEnd >= mat.length) {
                    rowEnd = mat.length - 1;
                }

                if(colStart < 0) {
                    colStart = 0;
                }

                if(colEnd >= mat[0].length) {
                    colEnd = mat[0].length - 1;
                }

                answer[i][j] = blockSum(mat, rowStart, rowEnd, colStart, colEnd);
            }
        }
    }

    private static int blockSum(int[][] mat, int rowStart, int rowEnd, int colStart, int colEnd) {
        int sum = 0;

        for(int i = rowStart; i <= rowEnd; i++) {
            for(int j = colStart; j <= colEnd; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }

}
