package FurthestPointFromOrigin;

public class Main {
    public static void main(String[] args) {
        String moves = "L_RL__R";
        int counter = 0;
        char prevChr = 'L';

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L'){
                counter++;
                prevChr = 'L';
            }
            if (moves.charAt(i) == 'R'){
                counter--;
                prevChr = 'R';
            }
            if(moves.charAt(i) == '_'){
                if(prevChr=='L'){
                    counter++;
                } else counter--;
            }
        }

        System.out.println(Math.abs(counter));
    }
}
