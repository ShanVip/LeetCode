package ToeplitzMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,2,1,3}};
        boolean answer = false;
        if (matrix.length==1 || matrix[0].length==1){
            answer=true;
        }
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if (matrix[i][j]==matrix[i+1][j+1]){
                    answer=true;
                }else {
                    answer=false;
                    i=100000;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
