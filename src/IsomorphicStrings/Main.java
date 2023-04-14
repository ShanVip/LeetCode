package IsomorphicStrings;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "bar";
        String t = "foo";

        HashMap<Character, Character> sMap = new HashMap<>();


        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                  answer=false;
                  break;
                }

            }else{
               if (sMap.containsValue(t.charAt(i))){
                   answer=false;
                   break;
               }
                sMap.put(s.charAt(i), t.charAt(i));

            }
        }

        System.out.println(answer);
    }
}
