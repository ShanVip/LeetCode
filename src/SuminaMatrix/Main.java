package SuminaMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        int answer = 0;


        for (int i = 0; i < nums[0].length; i++) {
            int maxValue = 0;
            for (int j = 0; j < nums.length; j++) {
                Arrays.sort(nums[j]);
                if (maxValue < nums[j][i] ){
                    maxValue = nums[j][i];
                }
            }
            answer+=maxValue;
        }

        System.out.println(answer);
    }
}
