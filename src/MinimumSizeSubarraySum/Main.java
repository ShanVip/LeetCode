package MinimumSizeSubarraySum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        Arrays.sort(nums);
        int target = 11;
        int[] buffer = nums.clone();
        int count = 0;
        int answer = 100000;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                answer=1;
                break;
            }
            if (nums[i] < target ){
                    count = 0;
                for (int j = i; j < buffer.length; j++) {
                    if (buffer[j] < target){
                        buffer[j]+=nums[i];
                        count++;
                    }
                    if (buffer[j]==target && answer>count){
                        answer = count;
                        count = 0;
                        buffer = nums.clone();
                    }
                    if (j == buffer.length-1 && buffer[j]>target){
                        count = 0;
                        buffer = nums.clone();
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
