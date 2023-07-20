package LargestCombinationWithBitwiseANDGreaterThanZero;

public class Main {
    public static void main(String[] args) {
     int[]  candidates = {16,17,71,62,12,24,14};
     int maxCount = 0;
     int step = 0;
     int maxStep = 0;

        for (int i = 0; i < candidates.length; i++) {
            if (maxCount < candidates[i]){
                maxCount = candidates[i];
            }
        }

        int stepen = 1;
        while (maxCount >= Math.pow(2, stepen) ){
            stepen++;
        }
        if (maxCount == (int) Math.pow(2, stepen)) {
            maxCount = (int) Math.pow(2, stepen);
        } else maxCount = (int) Math.pow(2, stepen - 1);





        while (maxCount > 0){
            for (int i = 0; i < candidates.length; i++) {
                if ((candidates[i] & maxCount) > 0){
                    step++;
                }
            }
            if (step > maxStep){
                maxStep = step;
            }
            maxCount = maxCount/2;
            step = 0;
        }


        System.out.println(maxStep);
    }
}
