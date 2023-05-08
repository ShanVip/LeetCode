package ShortestDistancetoaCharacter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';

        int n = s.length();
        int[] result = new int[n];
        int prev = Integer.MIN_VALUE / 2;


        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }
        prev = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }
        System.out.println(Arrays.toString(result));
    }
}

