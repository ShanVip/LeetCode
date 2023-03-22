package PalindromeNumber;

public class Main {
    public static void main(String[] args) {
        int x = 11;
        boolean detect = true;
        char[] chars = ("" + x).toCharArray();
            for (int i = 0; i < chars.length/2; i++) {
                if (chars[i] != chars[chars.length-i-1]) {
                    detect = false;
                    break;
                    }


            }
        System.out.println(detect);
        }

    }
