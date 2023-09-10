package CountLargestGroup;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int n = 111;

        HashMap<Integer, Integer> helper = new HashMap<>();


        for (int i = 1; i <= n; i++) {
            int total = 0;
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                total += digit;
                num /= 10;
            }
            if(helper.containsKey(total)){
                helper.put(total,helper.get(total)+1);
            }else helper.put(total, 1);
        }

        int maxGroupSize = 0;
        for (int value : helper.values()) {
            maxGroupSize = Math.max(maxGroupSize, value);
        }

        int countLargestGroups = 0;
        for (int value : helper.values()) {
            if (value == maxGroupSize) {
                countLargestGroups++;
            }
        }

        System.out.println(helper);
        System.out.println(countLargestGroups);
    }
}
