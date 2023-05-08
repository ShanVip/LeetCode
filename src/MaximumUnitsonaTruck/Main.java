package MaximumUnitsonaTruck;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

//        for (int[] row : boxTypes) {
//            System.out.println(Arrays.toString(row));
//        }

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            if (counter<truckSize){
                if (truckSize-counter<=boxTypes[i][0]){
                    System.out.println(sum);
                    sum += ((truckSize-counter)*boxTypes[i][1]);
                    System.out.println("dsadas");
                }else {
                    System.out.println(sum);
                    sum += (boxTypes[i][0]*boxTypes[i][1]);
                }
                counter += boxTypes[i][0];
            }
        }
        System.out.println(sum);
    }
}
