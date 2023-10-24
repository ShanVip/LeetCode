package SumofBeautyofAllSubstrings;

import java.util.HashMap;
import java.util.Map;

import static SumofBeautyofAllSubstrings.MapMinMaxValue.findMaxValue;
import static SumofBeautyofAllSubstrings.MapMinMaxValue.findMinValue;

public class Main {
    public static void main(String[] args) {
        String s = "aabcb";
        int start = 0;
        int next = 2;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= 1 ; i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            } else map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }


        int answer = 0;
        while(start!=next&&start<s.length()-3){
            while(next<s.length()){
                if(!map.containsKey(s.charAt(next))){
                    map.put(s.charAt(next),1);
                } else map.put(s.charAt(next), map.get(s.charAt(next))+1);
                Integer maxValue = findMaxValue(map);
                Integer minValue = findMinValue(map);
                answer += maxValue-minValue;
                next++;
            }
                System.out.println(answer);
                map.put(s.charAt(start), map.get(s.charAt(start))-1);
                if(map.get(s.charAt(start))==0){
                    map.remove(s.charAt(start));
                }
                Integer maxValue = findMaxValue(map);
                Integer minValue = findMinValue(map);
                answer += maxValue-minValue;
                start++;
        }

        System.out.println(answer);
    }
}
class MapMinMaxValue {
    public static <K, V extends Comparable<V>> V findMaxValue(Map<K, V> map) {
        V maxValue = null;
        for (V value : map.values()) {
            if (maxValue == null || (value != null && value.compareTo(maxValue) > 0)) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static <K, V extends Comparable<V>> V findMinValue(Map<K, V> map) {
        V minValue = null;
        for (V value : map.values()) {
            if (value != null && (minValue == null || value.compareTo(minValue) < 0)) {
                minValue = value;
            }
        }
        return minValue;
    }
}
