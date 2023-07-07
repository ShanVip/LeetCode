package MinimumDistancetotheTargetElement;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1, start = 9;

        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target){
                int ans=Math.abs(i-start);
                min=Math.min(ans,min);
            }
        }

        System.out.println(min);
    }
}