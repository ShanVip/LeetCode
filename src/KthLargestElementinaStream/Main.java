package KthLargestElementinaStream;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        int k = 3;

        int[] nums = new int[]{4, 5, 8, 2};
        int[] add = new int[]{3,5,10,9,4};

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.remove();
            }
        }

        for (int x:add) {
            queue.add(x);
            if (queue.size()>k){
                queue.remove();
            }
            System.out.println(queue.peek());
        }

    }

}
