package SortCharactersByFrequency;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s ="cccaaaaa";
        String answer ="";
        Map<Character, Integer> buffer = new HashMap<>();
        int counter = 1;

        for (int i = 0; i < s.length(); i++) {
           if(buffer.containsKey(s.charAt(i))){
               continue;
           }
            for (int j = i+1; j <s.length() ; j++) {
              if (s.charAt(i)==s.charAt(j)){
                  counter++;
                }
              else continue;
            }
            buffer.put(s.charAt(i), counter);
            counter=1;
        }
        Map<Character, Integer> result = buffer.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for (Character chr : result.keySet()) {

            for (int i = 0; i < result.get(chr); i++) {
                answer=chr+answer;
            }
        }
        System.out.println(answer);
    }
}
