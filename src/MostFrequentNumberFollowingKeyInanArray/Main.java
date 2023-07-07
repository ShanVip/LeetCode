package MostFrequentNumberFollowingKeyInanArray;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,100,200,1,100};
        int key = 1;

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==key){
                if (hashMap.containsKey(nums[i+1])) {
                    int count = hashMap.get(nums[i+1]);
                    hashMap.put(nums[i+1], count + 1);
                } else {
                    hashMap.put(nums[i+1], 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int keyWithMaxValue = 0;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int value = entry.getValue();

            if (value > max) {
                max = value;
                keyWithMaxValue = entry.getKey();
            }
        }

        System.out.println(keyWithMaxValue);

    }
}
