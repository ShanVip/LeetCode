package MoveZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1};

        int count = 0;

        for (int i = 0; i < nums.length-count; i++) {
            System.out.println(Arrays.toString(nums));

            if(nums[i]==0){

                for (int j = i+1; j < nums.length; j++) {
                    int buffer = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1] = buffer;

                }
                count++;
                i--;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
