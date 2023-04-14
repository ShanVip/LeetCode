package DistributeCandiestoPeople;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int candies = 60;
        int num_people = 4;
        int[] answer = new int[num_people];

        int count = 1;
        int i = 0;

        while (candies>0){
            if(count>candies){
                answer[i%num_people]+=candies;
                break;
            }

                candies=candies-count;
                answer[i%num_people]+=count;
                i++;
                count++;

        }
        System.out.println(Arrays.toString(answer));

    }
}
