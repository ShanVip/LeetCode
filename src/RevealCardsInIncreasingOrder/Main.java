package RevealCardsInIncreasingOrder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();

        System.out.println(Arrays.toString(deck));

        for(int i = deck.length-1; i >= 0; i--){
            if(q.size() > 0)   {
                q.add(q.poll());
            }
            q.add(deck[i]);
        }
        int[] res = new int[deck.length];
        for(int i=deck.length-1; i>=0; i--)
            res[i] = q.poll();


        System.out.println(Arrays.toString(res));


    }
}
