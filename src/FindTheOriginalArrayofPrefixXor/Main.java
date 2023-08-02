package FindTheOriginalArrayofPrefixXor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        int n = pref.length;
        int[] arr = new int[n];
        arr[0] = pref[0];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(pref));

        for (int i = (n - 1); i > 0; i--) {
            arr[i] = pref[i] ^ pref[i - 1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
