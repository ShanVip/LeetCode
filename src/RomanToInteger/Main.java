package RomanToInteger;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s ="LVIII";
        int n = s.length();

        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = m.get(s.charAt(i));
        }
//        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i] >= nums[i + 1])
                sum = sum + nums[i];
            else
                sum = sum - nums[i];
        }

        System.out.println(sum);

    }
}
