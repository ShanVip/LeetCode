package MaximumLengthofPairChain;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[][] pairs = {{1,2},{3,4},{2,3}};

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        for (int i = 0; i < pairs.length; i++) {
            System.out.println(Arrays.toString(pairs[i]));
        }

        int cur = Integer.MIN_VALUE, ans = 0;

        for (int[] pair : pairs) {
            if (cur < pair[0]) {
                cur = pair[1];
                ans++;
            }
        }

        System.out.println(ans);
        
    }
}
