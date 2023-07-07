package GroupthePeopleGiventheGroupSizeTheyBelongTo;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};

        ArrayList<List<Integer>> answer = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            if(hashMap.containsKey(groupSizes[i])){
                hashMap.get(groupSizes[i]).add(i);
            }else {
                ArrayList<Integer> buffer = new ArrayList<>();
                buffer.add(i);
                hashMap.put(groupSizes[i], buffer);
            }
        }

        for (int key : hashMap.keySet()) {
            ArrayList<Integer> help = hashMap.get(key);
            while (help.size() != 0){
                int size = key;
                List<Integer> xxx = new ArrayList<>();
                while (size!=0){
                    xxx.add(help.get(help.size()-1));
                    help.remove(help.size()-1);
                    size--;
                }
                answer.add(xxx);
            }
        }
    }
}
