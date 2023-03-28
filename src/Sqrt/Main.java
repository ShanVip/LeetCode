package Sqrt;

public class Main {
    public static void main(String[] args) {
        int x = 2147483647;
        long i = 1;

        while(i*i<x){
            i++;
        }
        if (i*i > x){
            System.out.println(i-1);
        } else System.out.println(i);

    }
}

