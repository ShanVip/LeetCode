package DecodeXORedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;

        int[]  answer = new int[encoded.length + 1];
        answer[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            answer[i + 1] =  encoded[i] ^  answer[i];
        }

        System.out.println(Arrays.toString(answer));
    }
}
