package NumberofPairsofStringsWithConcatenationEqualtoTarget;

public class Main {
    public static void main(String[] args) {
        String[] nums = {"1","1","1"};
        String target = "11";

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                    if ((nums[i]+nums[j]).equals(target)){
                        count++;
                    }
            }
        }

        for (int i = nums.length-1; i >=0; i--) {
            for (int j = i-1; j >=0; j--) {
                if ((nums[i]+nums[j]).equals(target)){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
