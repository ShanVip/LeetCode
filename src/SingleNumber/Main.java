package SingleNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,1,-1,3};
        Arrays.sort(nums);

        int count = 0;

        if(nums.length==1){
            count=nums[0];
        }

        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i]!=nums[i+1]){
                count=nums[i];
                break;
            } else {
                count=nums[nums.length-1];
            }
        }
        System.out.println(count);

    }
}
