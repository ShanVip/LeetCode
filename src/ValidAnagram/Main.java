package ValidAnagram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String s = "a";
    String t = "ab";

    char[] sChr = s.toCharArray();
    char[] tChr = t.toCharArray();

    Arrays.sort(sChr);
    Arrays.sort(tChr);

    boolean check = true;

    if (sChr.length!= tChr.length){
        check = false;
    } else {
        for (int i = 0; i < sChr.length; i++) {
            if (sChr[i]!=tChr[i]){
                check=false;
                break;
            }
        }
    }

        System.out.println(check);
    }
}
