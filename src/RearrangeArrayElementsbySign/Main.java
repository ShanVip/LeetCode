package RearrangeArrayElementsbySign;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};

        int[] answer = new int[nums.length];
        int positive = 0;
        int negative = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                answer[positive] = nums[i];
                positive += 2;
            }else {
                answer[negative] = nums[i];
                negative += 2;
            }
        }

        System.out.println(Arrays.toString(answer));

    }
}
