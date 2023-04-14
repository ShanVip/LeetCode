package AddtoArrayFormofnteger;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7};
        int k = 1;
         long x =(long) Math.pow(10, num.length-1);
         long count = 0;

        for (int i = 0; i < num.length; i++) {
            count = (count +(num[i]*x));
            x=x/10;
        }

        System.out.println(count);

        count=count+k;

        int[] numArray = String.valueOf(count).chars().map(Character::getNumericValue).toArray();
        List<Integer> numList = new ArrayList();

        for (int i = 0; i < numArray.length; i++) {
            numList.add(numArray[i]);
        }

        System.out.println(Arrays.toString(numArray));


    }

}
