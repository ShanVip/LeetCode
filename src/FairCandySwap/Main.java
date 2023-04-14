package FairCandySwap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};

        int x = Arrays.stream(aliceSizes).sum();
        int y = Arrays.stream(bobSizes).sum();

        int differ = Math.abs(x-y);
        int[] answer = new int[2];
        if (x < y) {
            for (int i = 0; i < aliceSizes.length; i++) {
                for (int j = 0; j < bobSizes.length; j++) {
                    if ((aliceSizes[i] + differ / 2) == bobSizes[j]) {
                        answer[0] = aliceSizes[i];
                        answer[1] = bobSizes[j];
                        i=1000000;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < aliceSizes.length; i++) {
                for (int j = 0; j < bobSizes.length; j++) {
                    if ((aliceSizes[i] - differ / 2) == bobSizes[j]) {
                        answer[0] = aliceSizes[i];
                        answer[1] = bobSizes[j];
                        i=1000000;
                        break;
                    }
                }
            }
        }


        System.out.println(Arrays.toString(answer));

    }
}
