package FindtheArrayConcatenationValue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5};
        long concatenation = 0;

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            deque.add(nums[i]);
        }

        for (int i = 0; i < deque.size() ; i++) {
            String x,y;
            if (deque.size()==1){
                x = deque.removeFirst().toString();
                concatenation += Integer.parseInt(x);
                break;
            }
            x = deque.removeFirst().toString();
            y = deque.removeLast().toString();
            concatenation += Integer.parseInt(x+y);
        }

        System.out.println(concatenation);

    }
}
