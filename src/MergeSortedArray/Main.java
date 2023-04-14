package MergeSortedArray;

import java.util.Arrays;

public class Main<x> {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;

        int[] nums2 = {2,5,6};
        int n = 3;

        int first=0;
        int second=0;

        int[] answer = new int[m+n];

        for (int i = 0; i < answer.length; i++) {
            if (second < n && first < m){
                if (nums1[first]>nums2[second]){
                    answer[i]=nums2[second];
                    second++;
                }else{
                    answer[i]=nums1[first];
                    first++;
                }
            }else { if (first<m){
                answer[i]=nums1[first];
                first++;
            }
            if (second<n){
                answer[i]=nums2[second];
                second++;
            }

            }

        }

        System.out.println(Arrays.toString(answer));



    }
}
