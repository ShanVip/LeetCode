package FindTriangularSumofanArray;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,6,6,2,5,7};
        int n = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
            n--;
        }
        System.out.println(nums[0] % 10);
    }
}