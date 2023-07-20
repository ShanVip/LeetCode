package CountNumberofDistinctIntegersAfterReverseOperations;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            set.add(reverseNumber(nums[i]));

        }

        System.out.println(set.size());

    }
    public static int reverseNumber(int number) {
        String numberString = Integer.toString(number);
        StringBuilder reversedString = new StringBuilder(numberString).reverse();
        int reversedNumber = Integer.parseInt(reversedString.toString());
        return reversedNumber;
    }
}
