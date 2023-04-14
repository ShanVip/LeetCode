package MaximizeSumOfArrayAfterKNegations;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,6,9,-3,3};
        int k = 2;

        while (k>0){
            int min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (min==nums[i]){
                    nums[i]=nums[i]*(-1);
                    break;
                }
            }
            k--;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(nums));


    }
}
