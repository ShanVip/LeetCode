package BestTimetoBuyandSell;

public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int answer = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]-prices[i] > answer){
                    answer = prices[j]-prices[i];
                }
            }
        }

        System.out.println(answer);
    }
}
