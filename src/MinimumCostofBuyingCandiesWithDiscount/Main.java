package MinimumCostofBuyingCandiesWithDiscount;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] cost = {1,2,3};
        Integer[] integerArray = new Integer[cost.length];
        for (int i = 0; i < cost.length; i++) {
            integerArray[i] = Integer.valueOf(cost[i]);
        }

        Arrays.sort(integerArray, Comparator.reverseOrder());

        System.out.println(Arrays.toString(integerArray));

        int total = 0;
        for (int i = 0; i < integerArray.length ; i++) {
            if (i % 3 != 2){
                total += integerArray[i];
            }
        }

        System.out.println(total);
    }
}
