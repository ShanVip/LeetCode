package TakeGiftsFromtheRichestPile;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] gifts = new int[]{1,1,1,1};
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : gifts) {
            if(i>0)
                queue.add(i);
        }
        int count = 0;
        int k = 4;
        for (int i = 0; i < k; i++) {
            queue.add((int) Math.sqrt(queue.remove()));
        }
        while(!queue.isEmpty()){
            count += queue.remove();
        }
        System.out.println(count);
    }
}
