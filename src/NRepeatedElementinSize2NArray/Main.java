package NRepeatedElementinSize2NArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        Arrays.sort(nums);

        int answer = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                answer=nums[i];
                break;
            }
        }

        System.out.println(answer);

    }
}
