package MergeTwobySumming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[][] nums1 = {{1,2},{2,3},{3,5}};
       int[][] nums2 = {{1,4},{3,2},{4,1},{5,3}};

        ArrayList<int[]> answer = new ArrayList<>();
        int[] buffer = new int[2];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i][0]==nums2[j][0]){

                    buffer = new int[]{nums1[i][0],nums1[i][1] + nums2[j][1]};
                    System.out.println("Buffer" + Arrays.toString(buffer));
                    answer.add(buffer);
                    nums2[j][0] = -1;
                    break;

                }else if (j == nums2.length-1) {
                    answer.add(nums1[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i][0] != -1){
                answer.add(nums2[i]);
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(Arrays.toString(answer.get(i)));
        }

        int[][] array = new int[answer.size()][];
        for (int i = 0; i < answer.size(); i++) {
            array[i] = answer.get(i);
        }

        Arrays.sort(array);

    }
}
