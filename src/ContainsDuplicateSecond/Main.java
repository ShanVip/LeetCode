package ContainsDuplicateSecond;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean answer = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    answer = true;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
