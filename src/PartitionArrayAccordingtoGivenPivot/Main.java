package PartitionArrayAccordingtoGivenPivot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        List<Integer> small = new ArrayList<>();
        List<Integer> medium = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot){
                small.add(nums[i]);
            } else if (nums[i] == pivot) {
                medium.add(nums[i]);
            } else if (nums[i] > pivot) {
                bigger.add(nums[i]);
            }
        }

        List<Integer> combinedList = new ArrayList<>();
        combinedList.addAll(small);
        combinedList.addAll(medium);
        combinedList.addAll(bigger);

        nums = combinedList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}
