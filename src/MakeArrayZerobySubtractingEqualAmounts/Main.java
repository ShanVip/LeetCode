package MakeArrayZerobySubtractingEqualAmounts;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,0,3,5};
        HashSet<Integer> answer = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
            answer.add(nums[i]);
        }
        System.out.println(answer.size());

    }
}
