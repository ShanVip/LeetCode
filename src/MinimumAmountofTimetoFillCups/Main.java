package MinimumAmountofTimetoFillCups;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : arr) {
          if(i>0)
              maxHeap.add(i);
        }
        int x;
        int y;

        int count = 0;
        while (maxHeap.size() > 1){
            x=maxHeap.remove()-1;
            y=maxHeap.remove()-1;
            if(x!=0)
                maxHeap.add(x);
            if(y!=0)
                maxHeap.add(y);
            count+=1;
        }
        if(maxHeap.size() == 1)
            count = maxHeap.remove();


        System.out.println(count);






    }
}
