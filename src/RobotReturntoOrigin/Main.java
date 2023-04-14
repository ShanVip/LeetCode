package RobotReturntoOrigin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String moves = "UD";


        List<Character> u = new ArrayList<Character>();
        List<Character> d = new ArrayList<Character>();
        List<Character> l = new ArrayList<Character>();
        List<Character> r = new ArrayList<Character>();

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i)=='U'){
                u.add(moves.charAt(i));
            }
            if (moves.charAt(i)=='D'){
                d.add(moves.charAt(i));
            }
            if (moves.charAt(i)=='L'){
                l.add(moves.charAt(i));
            }
            if (moves.charAt(i)=='R'){
                r.add(moves.charAt(i));
            }
        }

        System.out.println(u.size()==d.size() && l.size() == r.size());
    }
}
