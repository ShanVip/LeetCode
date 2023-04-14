package SetMismatch;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4,6,5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Deque<Integer> numsQueue = new LinkedList<>();


        int[] answer = new int[2];

        for (int i = 0; i < nums.length-1; i++) {
           numsQueue.add(nums[i]);
           if (numsQueue.peekLast()==nums[i+1]){
               break;
           }

        }
        System.out.println(numsQueue);
        answer[0]=numsQueue.peekLast();

        for (int i = 0; i < nums.length-1; i++) {
            int j = i+1;
            if ((nums[i]+nums[j])%2==0&&nums[i]!=nums[j]){
                answer[1]=(nums[i]+nums[j])/2;
                break;
            }else if(nums.length==2&&nums[0]==1){
                answer[1]=numsQueue.peekLast()+1;
            }
            else if((nums[i]+nums[j])%2!=0&&nums[i]!=nums[j]&&nums[0]!=1){
                answer[1]=nums[0]-1;
            }
            else if((nums[i]+nums[j])%2!=0&&nums[i]!=nums[j]&&nums[0]==1){
                answer[1]=nums[nums.length-1]+1;
            }
            else{
                answer[1]=numsQueue.peekLast()-1;
            }
        }




        System.out.println(Arrays.toString(answer));

    }
}
