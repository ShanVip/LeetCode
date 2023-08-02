package PeakIndexinaMountainArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,3,4,5,4,2,1};

        int left = 0;
        int right = arr.length - 1;


        int middle = (left + right) / 2;

        while (left < right){
            middle = (left + right) / 2;
            if (arr[middle] > arr[middle-1] && arr[middle]>arr[middle+1]){
                break;
            }
            if ( arr[middle] > arr[middle-1]) {
                left = middle;
            }
            else right = middle;
        }

        System.out.println(middle);
    }
}
