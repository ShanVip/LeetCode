package KthLargestElementinanArray;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i : nums){
            queue.add(i);
            if(queue.size() > k) {
                queue.poll();
            }
        }

        System.out.println(queue);
    }
}
