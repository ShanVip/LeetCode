package LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit;

import java.net.Inet4Address;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10,1,2,4,7,2};
        int limit = 4;

        int left = 0;
        int right = 0;
        int maxLength = 0;

        PriorityQueue<Integer> answerMin = new PriorityQueue<>();
        PriorityQueue<Integer> answerMax = new PriorityQueue<>((a, b) -> b - a);

        while (right < nums.length) {
            answerMax.add(nums[right]);
            answerMin.add(nums[right]);

            while (answerMax.peek() - answerMin.peek() > limit) {
                answerMax.remove(nums[left]);
                answerMin.remove(nums[left]);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        System.out.println(maxLength);

    }
}
