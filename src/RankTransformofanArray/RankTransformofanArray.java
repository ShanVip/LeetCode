package RankTransformofanArray;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofanArray {
    public static void main(String[] args) {
       int[] arr = {40,10,20,30,50,40};
       int len = arr.length;
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

       int[] nums = new int[len];


        for(int i=0; i<len; i++) {
            nums[i] = arr[i];
        }


        Arrays.sort(nums);

        int rank=1;
        for(int i=0; i<len; i++) {
            if(! map.containsKey(nums[i])) {
                map.put(nums[i], rank++);
            }
        }

        for(int i=0; i<len; i++) {
            arr[i]=map.get(arr[i]);
        }
    }
}
