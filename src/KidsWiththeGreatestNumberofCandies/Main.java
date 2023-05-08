package KidsWiththeGreatestNumberofCandies;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        boolean[] answer = new boolean[candies.length];

        for (int i = 0; i < candies.length-1; i++) {
                answer[i]=(candies[i]>candies[i+1]);
        }

        System.out.println(Arrays.toString(answer));

    }
}
