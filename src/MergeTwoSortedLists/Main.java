package MergeTwoSortedLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);

        int x = list2.size();

        while(!list2.isEmpty()){
            list1.add(list2.remove(x));
            x = x-1;
        }
        Collections.sort(list1);
        System.out.println(list1);
    }
}
