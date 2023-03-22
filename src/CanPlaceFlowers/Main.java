package CanPlaceFlowers;

public class Main {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,1};
        int n = 3;

        if (n == 0) {
            System.out.println(true);;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    System.out.println(true);;
                }else{
                    System.out.println(false);
                }
            }
        }

    }
}

