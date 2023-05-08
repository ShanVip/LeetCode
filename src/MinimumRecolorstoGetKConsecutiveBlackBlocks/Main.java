package MinimumRecolorstoGetKConsecutiveBlackBlocks;

public class Main {
    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;
        int counter = 10000;
        int b = 0,w = 0;
        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i)=='B'){
                b++;
            }else w++;
            if (b+w==k+1){
                if (blocks.charAt(i-k)=='B'){
                    b--;
                }else w--;
            }
            if (b+w==k){
                counter=Math.min(counter, w);
            }
        }

        System.out.println(counter);
    }
}
