package SumofDigitsofanInteger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 4421;
        String strNumber = Integer.toString(n);
        int[] array = new int[strNumber.length()];
        for (int i = 0; i < strNumber.length(); i++) {
            array[i] = Character.digit(strNumber.charAt(i), 10);

            }

        int x = 1;
        int y = 0;

        for (int i = 0; i < array.length; i++) {
            x = x*array[i];
            y += array[i];
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(x-y);
        }
    }

