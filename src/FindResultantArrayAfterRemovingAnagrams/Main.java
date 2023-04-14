package FindResultantArrayAfterRemovingAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       String[] words = {"abba","baba","bbaa","cd","cd"};
       String[] wordsAnswer = words.clone();
        for (int i = 0; i < words.length; i++) {
            char[] charArr = words[i].toCharArray();
            Arrays.sort(charArr);
            words[i] = new String(charArr);
        }

        System.out.println(Arrays.toString(words));
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])){
                wordsAnswer[i] = "1";
            }
        }
        List<String> answer = new ArrayList<String>();

        for (int i = 0; i < wordsAnswer.length; i++) {
            if(!wordsAnswer[i].equals("1")){
                answer.add(wordsAnswer[i]);
            }
        }
        System.out.println(answer);
    }
}
