package ArrangingCoins;

public class Main {
    public static void main(String[] args) {

        int n = 8;
        int counter = 1;
        long lvl = 2;

        while (counter<n){
            counter+=lvl;
            lvl++;
        }
        if(counter>n){
            lvl--;
        }
        System.out.println(--lvl);




    }
}
