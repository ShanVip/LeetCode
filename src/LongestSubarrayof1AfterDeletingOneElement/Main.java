package LongestSubarrayof1AfterDeletingOneElement;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1};

        int cur = 0;
        int prev = 0;
        int answer = 0;
        boolean check = false;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                cur++;
            }else if(nums[i]==0){
                if (answer<prev+cur){
                    answer=prev+cur;

                }
                prev = cur;
                cur=0;
                check=true;
            }
        }

        if(nums[nums.length-1]==1){
            if (answer<prev+cur){
                answer=prev+cur;
            }
        }
        if(check){
            System.out.println(answer);
        }else System.out.println(answer-1);


    }
}
