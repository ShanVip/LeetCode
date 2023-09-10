package FlipColumnsForMaximumNumberofEqualRows;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {  {0,0,0},
                            {0,0,1},
                            {1,1,0} };




        HashMap<String, Integer> helper = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0]==1){
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j]^=1;
                }
            }
            String key = Arrays.toString(matrix[i]);
                if(helper.containsKey(key)){
                    helper.put(key,helper.get(key)+1);
                }else helper.put(key, 1);
        }

        int answer = 0;
        for(int value : helper.values()){
            if(answer<value){
                answer=value;
            }
        }
        System.out.println(answer);
    }

}
