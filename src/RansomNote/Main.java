package RansomNote;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";

        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if (ransomMap.containsKey(ransomNote.charAt(i))) {
                ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i)) + 1);
            } else {
                ransomMap.put(ransomNote.charAt(i), 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (magazineMap.containsKey(magazine.charAt(i))) {
                magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i)) + 1);
            } else {
                magazineMap.put(magazine.charAt(i), 1);
            }
        }

        boolean answer = true;
        for (Character key : ransomMap.keySet()) {
            if (magazineMap.containsKey(key)) {
                int value1 = ransomMap.get(key);
                int value2 = magazineMap.get(key);

                if (value1 > value2) {
                   answer = false;
                   break;
                } else {
                    magazineMap.put(key, value1 - value2);
                }
            } else if (!magazineMap.containsKey(key)){
                answer=false;
                break;
            }
        }
        System.out.println(answer);

    }
}
