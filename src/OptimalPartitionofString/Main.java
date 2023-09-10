package OptimalPartitionofString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "hdklqkcssgxlvehva";
        char[] chr = s.toCharArray();
        HashMap<Character, Integer> helper = new HashMap<>();

        for (int i = 0; i < chr.length; i++) {

            if(helper.containsKey(chr[i])){
                helper.put(chr[i], helper.get(chr[i]) + 1);
            } else helper.put(chr[i], 1);

        }

        System.out.println(helper);

        List<String> answer = new ArrayList<>();

        boolean allZero = false;
        while (!allZero) {
            allZero = true;
            StringBuilder str = new StringBuilder();

            for (Map.Entry<Character, Integer> entry : helper.entrySet()) {
                Character key = entry.getKey();
                int val = entry.getValue();

                if (val > 0) {
                    allZero = false;
                    entry.setValue(val - 1);
                    str.append(key);
                }
            }



            if (str.length() > 0) {
                answer.add(str.toString());
            }
        }

        System.out.println(answer);

    }
}
