package FormSmallestNumberFromTwoDigitArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,1,3};
        int[] nums2 = {5,7};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int answer = nums1[0]*10 + nums2[0];
        System.out.println(answer);

    }
}
