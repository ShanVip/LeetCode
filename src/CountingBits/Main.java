package CountingBits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] answer = new int[n+1];
        int buffer = 0;

        for (int i = 0; i <= n; i++) {
            for (char chr: Integer.toBinaryString(i).toCharArray()) {
                if (chr == '1') {
                    buffer++;
                }
            }
            answer[i]=buffer;
            buffer=0;
        }

        System.out.println(Arrays.toString(answer));


    }
}
