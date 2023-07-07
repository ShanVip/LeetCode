package CountElementsWithStrictlySmallerandGreaterElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 3, 15};
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] > nums[0] && nums[i] < nums[nums.length-1] ){
                count++;
            }
        }
        System.out.println(count);
    }
}
