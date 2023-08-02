package MaximumIceCreamBars;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] costs = {1,6,3,1,2,5};
        int coins = 20;

        Arrays.sort(costs);
        int ice = 0;
        int sum = 0;
        System.out.println(Arrays.toString(costs));
        for (int i = 0; i < costs.length; i++) {

            if(sum <= coins){
                sum+=costs[i];
                ice ++;

            }

        }

        System.out.println(sum );
        System.out.println(sum );

        if (sum <= coins){
            System.out.println(ice);
        } else System.out.println(ice-1);
    }
}
