package CheckifArrayIsSortedandRotated;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,1};
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[(i+1)%nums.length])
                count++;
        }
        System.out.println(count<=1);;
    }
}
