package ContainerWithMostWater;

public class Main {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int answer=0, left=0, right=height.length-1;
        while(left<right) {
            answer = Math.max(answer, Math.min(height[left],height[right]) * (right-left));
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        System.out.println(answer);
    }
}