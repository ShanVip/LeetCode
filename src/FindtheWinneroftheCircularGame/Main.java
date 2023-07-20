package FindtheWinneroftheCircularGame;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        Queue<Integer> queue = new LinkedList();

        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        System.out.println(queue);


        while (queue.size() != 1) {
            for (int i = k - 1; i > 0; i--) {
                queue.add(queue.remove());
            }

            queue.remove();
        }
        System.out.println(queue.peek());
    }
}
