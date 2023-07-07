package LexicographicallySmallestPalindrome;

import java.nio.charset.Charset;

import static java.nio.charset.Charset.defaultCharset;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        String s = "egcfe";
        char[] answer = s.toCharArray();

        for (int i = 0; i < answer.length/2; i++) {
            if (answer[i] != answer[answer.length-1-i]){
                if(answer[i] < answer[answer.length-1-i]){
                    answer[answer.length-1-i] = answer[i];
                }else answer[i] = answer[answer.length-1-i];
            }
        }
        String str1 = new String(answer);
        System.out.println(str1);
    }
}
