package ReverseVowelsofaString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        char[] charArray = s.toCharArray();
        String vowels = "aeiouAEIOU";
        System.out.println(Arrays.toString(charArray));
        char res = 'x';



        for (int i = 0; i < charArray.length/2; i++) {
            for (int j = charArray.length-1; j >= s.length()/2 ; j--) {
                if (vowels.contains(Character.toString(s.charAt(i))) && vowels.contains(Character.toString(s.charAt(j)))){
                    res = charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=res;
                    i++;
                    j--;
                }

            }

        }
        System.out.println(Arrays.toString(charArray));

//        for (int i = 0, j = charArray.length - 1; i < j;) {
//            if (vowels.indexOf(charArray[i]) != -1 && vowels.indexOf(charArray[j]) != -1) {
//                char tmp = charArray[i];
//                charArray[i] = charArray[j];
//                charArray[j] = tmp;
//                i++;
//                j--;
//            } else if (vowels.indexOf(charArray[i]) == -1) {
//                i++;
//            } else if (vowels.indexOf(charArray[j]) == -1) {
//                j--;
//            }
//        }
//
//        System.out.println(Arrays.toString(charArray));

    }
}
