package NeitherMinimumnorMaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int answer = -1;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] < max && nums[i] > min){
                    answer = nums[i];
                    break;
            }
        }

        System.out.println(answer);

    }
}


