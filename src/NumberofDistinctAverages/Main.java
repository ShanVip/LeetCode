package NumberofDistinctAverages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       int[] nums = {4,1,4,0,3,5};
        Arrays.sort(nums);

        HashSet<Float> answer = new HashSet<>();

        for (int i = 0; i < nums.length/2; i++) {

            answer.add((float) ((nums[i] + nums[nums.length-1-i]) / 2.0));

        }

        System.out.println(answer.size());

    }
}
