package MaximumNumberofCoinsYouCanGet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] piles = {2,4,1,2,7,8};
        Arrays.sort(piles);

        Deque<Integer> answer = new ArrayDeque<>();

        for (int i = 0; i < piles.length; i++) {
            answer.add(piles[i]);
        }

        int counter = 0;

        while (answer.size()!=0){
            answer.removeFirst();
            answer.removeLast();
            counter += answer.removeLast();
        }


        System.out.println(counter);
    }
}
