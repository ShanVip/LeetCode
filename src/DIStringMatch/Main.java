package DIStringMatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "DDI";
        int[] answer = new int[s.length()+1];

        int left = 0;
        int right = answer.length-1;
        for (int i = 0; i < answer.length-1; i++) {
                if(s.charAt(i)=='I'){
                    answer[i]=left;
                    left++;
                }
                if(s.charAt(i)=='D'){
                 answer[i]=right;
                 right--;
                }
        }
        answer[answer.length-1]=right;
        System.out.println(Arrays.toString(answer));
    }
}
