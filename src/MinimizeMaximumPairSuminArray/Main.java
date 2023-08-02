package MinimizeMaximumPairSuminArray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        Arrays.sort(nums);

        int answer = 0;

        for (int i = 0; i < nums.length/2; i++) {

                if(answer < nums[i] + nums[nums.length-1 - i]){
                    answer = nums[i] + nums[nums.length-1 - i];
                }

        }

        System.out.println(answer);

    }
}
