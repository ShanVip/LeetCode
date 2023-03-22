package MinCostClimbingStairs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] cost ={1,100,1,1,1,100,1,1,100,1};

        int[] dp = new int[cost.length];

        for (int i = 0; i < cost.length; i++) {
            if(i<=1){
                dp[i]=cost[i];
            }
            else{
                int first = dp[i-1];
                int second = dp[i-2];


                dp[i]=Math.min(first, second) + cost[i];
            }
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(Math.min(dp[dp.length-1], dp[dp.length-2]));
    }
}
