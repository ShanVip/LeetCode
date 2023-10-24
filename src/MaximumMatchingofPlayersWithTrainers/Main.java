package MaximumMatchingofPlayersWithTrainers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] players = {4,7,9};
       int[] trainers = {8,2,5,8};

        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        int i= players.length-1;
        int j = trainers.length-1;
        while(i>=0 && j>=0){
            if (players[i]<=trainers[j]){
                count++;
                i--;
                j--;
            }else i--;
        }




        System.out.println(count);

    }
}
