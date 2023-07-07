package MaxConsecutiveOnes;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int count = 0;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                if (i == nums.length-1 && count>=answer){
                    count++;
                    answer=count;
                }
                count++;
            }  else {
                if (count>answer){
                    answer=count;
                }
                count = 0;
            }

        }

        System.out.println(answer);
    }
}
