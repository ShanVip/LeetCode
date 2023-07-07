package SortEvenandOddIndicesIndependently;

import java.util.Arrays;

public class SortEvenandOddIndicesIndependently {
    public static void main(String[] args) {
       int[] nums = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};

       int buffer = 0;
       boolean predict;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(i % 2 == 0 && nums[i] < nums[j] && j % 2 == 0 ){
                            buffer = nums[i];
                            nums[i] = nums[j];
                            nums[j] = buffer;
                }
                if(i % 2 != 0 && nums[i] > nums[j] && j % 2 != 0 ){
                    buffer = nums[i];
                    nums[i] = nums[j];
                    nums[j] = buffer;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
