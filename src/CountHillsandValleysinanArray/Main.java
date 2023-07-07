package CountHillsandValleysinanArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,4,1,1,6,5};

        int count= 0, left = nums[0];
        for(int i = 1; i < nums.length - 1; i++)
            if(left < nums[i] && nums[i] > nums[i + 1] || left > nums[i] && nums[i] < nums[i + 1]){
                count++;
                left = nums[i];
            }
        System.out.println(count);
    }
}
