package LatestTimebyReplacingHiddenDigits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String time = "0?:3?";
        int index = time.indexOf(":");
        String firstPart = time.substring(0, index);
        String secondPart = time.substring(index + 1);

        char[] answer = new char[time.length()];
        System.out.println(firstPart);
        System.out.println(secondPart);

        for (int i = 0; i < firstPart.length(); i++) {
            if (firstPart.charAt(i) == '?' && i == 0) {
                answer[0] = '2';
                answer[1] = firstPart.charAt(1);
                answer[2] = ':';
                break;
            } else {
                answer[1] = '3';
                answer[0] = firstPart.charAt(0);
                answer[2] = ':';
                break;
            }
        }

        for (int i = 0; i < secondPart.length(); i++) {
            if (secondPart.charAt(i) == '?' && i == 0) {
                answer[3] = '5';
                answer[4] = secondPart.charAt(1);
                break;
            } else {
                answer[4] = '9';
                answer[3] = secondPart.charAt(0);
                break;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
