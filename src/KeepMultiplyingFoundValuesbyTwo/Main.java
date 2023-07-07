package KeepMultiplyingFoundValuesbyTwo;

public class Main {
    public static void main(String[] args) {
       int[] nums = {8,19,4,2,15,3};
       int original = 2;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original){
                original *= 2;
                i=-1;
            }
        }

        System.out.println(original);
    }
}
