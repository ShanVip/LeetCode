package LargestPositiveIntegerThatExistsWithItsNegative;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-5, 1,-2};
        int min = -1;
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > 0; j--) {
                if (Math.abs(nums[i])==nums[j]){
                    min = nums[j];
                    break;
                }
            }
            if (min!=-1){
                break;
            }

        }
        System.out.println(min);
    }
}
