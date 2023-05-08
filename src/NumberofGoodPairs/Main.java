package NumberofGoodPairs;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
