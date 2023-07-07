package KthMissingPositiveNumber;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        int count = arr[0]-1;
        int answer = 0;
        if (arr.length == 1){
            answer = arr[0] + k;
        }else {

            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] + 1 != arr[i+1]){
                    count += arr[i+1] - arr[i]-1;
                }
                if (count > k){
                    answer = arr[i] + count - k + 1;
                }
                if (count == k){
                    answer = arr[i];
                }
                if (count == 0){
                    answer = arr[arr.length-1] + k;
                }
            }
        }

        System.out.println(answer);
    }
}
