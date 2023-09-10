package LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String digits = "23";
        HashMap<Character, String> helper = new HashMap<>();
        helper.put('2', "abc");
        helper.put('3', "def");
        helper.put('4', "ghi");
        helper.put('5', "jkl");
        helper.put('6', "mno");
        helper.put('7', "pqrs");
        helper.put('8', "tuv");
        helper.put('9', "wxyz");


        List<String> result = new ArrayList<>();
        result.add("");

        for (char digit : digits.toCharArray()) {
            String letters = helper.get(digit);
            List<String> newCombinations = new ArrayList<>();

            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }

            result = newCombinations;
        }

        System.out.println(result);

    }
}
