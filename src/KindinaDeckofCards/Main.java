package KindinaDeckofCards;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] deck = {1,1,1,2,2,2,3,3};
        boolean answer = true;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < deck.length; i++) {
            if(!map.containsKey(deck[i])){
                map.put(deck[i], 1);
            }else map.put(deck[i], map.get(deck[i])+1);
        }
        System.out.println(map);
        for (int val: map.values()){
            if (val%2!=0){
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}
