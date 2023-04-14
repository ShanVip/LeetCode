package MountainArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,8,9,10,11,12,11};
        boolean answer = true;
        int left = 0;
        int right = arr.length-1;

        if (arr.length < 3) {
            answer = false;
        } else {
            for (int i = 0; i <arr.length-1; i++) {
                left=i;
                int j = i + 1;
                if (arr[i] == arr[j] || arr[i] > arr[j] ) {

                    break;
                }

            }

            for (int i = arr.length - 1; i > 0; i--) {
                right=i;
                int j = i - 1;
                if (arr[i] == arr[j] || arr[i] > arr[j]) {

                    break;
                }
            }

        }
        System.out.println(left==right);
    }
}
