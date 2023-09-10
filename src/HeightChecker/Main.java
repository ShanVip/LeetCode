package HeightChecker;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

       int[] heights = {1,1,4,2,1,3};

       int[] sort = heights.clone();
       Arrays.sort(sort);

        System.out.println(Arrays.toString(heights));
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!=sort[i]){
                count++;
            }
        }

        System.out.println(count);

    }
}
