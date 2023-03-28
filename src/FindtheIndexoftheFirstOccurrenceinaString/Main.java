package FindtheIndexoftheFirstOccurrenceinaString;


import java.sql.SQLOutput;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String haystack = "leetcodeleet";
        String needle = "leet";

        if(haystack.length()<needle.length())
            System.out.println(-1);

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length()) {
                System.out.println(i);
                break;
            } else{
                System.out.println(-1);
                break;
            }

        }

    }
}
