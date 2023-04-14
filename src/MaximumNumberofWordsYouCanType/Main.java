package MaximumNumberofWordsYouCanType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "adl";

        String[] stringArray = text.split(" ");
        char[] charA = brokenLetters.toCharArray();

        System.out.println(Arrays.toString(stringArray));
        int count = stringArray.length;
        for (int i = 0; i < stringArray.length; i++) {
            for (int c = 0; c < stringArray[i].length(); c++) {
                for (int j = 0; j < charA.length; j++) {
                    if(charA[j]==stringArray[i].charAt(c)){
                        count--;
                        c=10000;
                        break;
                    }
                }
            }
        }


        System.out.println(count);

    }
}
