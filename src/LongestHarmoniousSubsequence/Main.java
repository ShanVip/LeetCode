package LongestHarmoniousSubsequence;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,2};

        Arrays.sort(nums);

        int counter = 0;
        int startPosition = nums[0];
        int answer = 0;
        int saveIndex = 1000000;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - startPosition == 0){
                counter++;
            } else if (nums[i] - startPosition == 1) {
                        if (i < saveIndex){
                            saveIndex = i;
                            counter++;
                        }

                        counter++;
                        if (answer < counter && i == nums.length-1){
                            answer = counter;
                        }

            } else if (nums[i] - startPosition > 2) {
                 if (answer < counter){
                     answer=counter;
                     startPosition = nums[saveIndex];;
                     counter = 0;
                 }else {
                     startPosition = nums[saveIndex];
                     counter = 0;
                 }

            } else if (nums[i] - startPosition == 2 && i == nums.length-1) {

                if (answer < counter){
                    answer=counter;
                    startPosition = nums[saveIndex];
                    counter++;
                }
            }
        }

        System.out.println(answer);

     }
}
