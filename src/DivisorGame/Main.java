package DivisorGame;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N =103;
        boolean[] dp = new boolean[N+1];
        for(int i=1;i<=N;i++)
        {
            if(i==1) dp[i]=false;
            else if(i==2) dp[i]=true;
            else{
                for(int j=1;j*j<=i;j++)
                {

                        dp[i] = !dp[i-j];
                        break;

                }
            }
        }
        System.out.println(dp[N]);
    }
}
