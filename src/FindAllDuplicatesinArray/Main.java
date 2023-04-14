package FindAllDuplicatesinArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        Arrays.sort(nums);

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]==nums[j]){
                    answer.add(nums[i]);
                }
            }
        }
        System.out.println(answer);
    }
}
