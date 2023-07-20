package ConcatenationofArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]  nums = {1,2,1};
        int[] answer = new int[nums.length * 2];

        for (int i = 0; i < nums.length * 2; i++) {
            if(i < nums.length){
                answer[i] = nums[i];
            }
            else answer[i] = nums[i - nums.length];
        }

        System.out.println(Arrays.toString(answer));

    }
}
