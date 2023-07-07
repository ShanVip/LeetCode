package ThirdMaximumNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1};

        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num:nums){
            if (num> max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num>secondMax && num<max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num>thirdMax && num<secondMax) {
                thirdMax = num;
            }
        }
        int result = (thirdMax==Long.MIN_VALUE) ? (int)max : (int)thirdMax;
        System.out.println(result);
    }
}
