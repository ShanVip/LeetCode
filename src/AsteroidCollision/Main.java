package AsteroidCollision;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] asteroids ={5,10,-5};

        Deque<Integer> answer = new ArrayDeque<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (answer.size() == 0){
                answer.add(asteroids[i]);
                continue;
            }
            boolean exist = true;
            while (answer.size() > 0 && exist) {
                if (answer.peekLast() < 0){
                answer.add(asteroids[i]);
                exist = false;
            }else {
                if (asteroids[i] > 0){
                    break;
                }
                if (answer.peekLast() == Math.abs(asteroids[i])){
                    answer.removeLast();
                    exist = false;
                }
                else if (answer.peekLast() > Math.abs(asteroids[i])){
                    exist = false;
                } else  {
                    answer.removeLast();
                }
            }
            }
            if (exist){
                answer.add(asteroids[i]);
            }

        }

        int[] answerInt = new int[answer.size()];
        for (int i = 0; i < answerInt.length; i++) {
            answerInt[i] = answer.removeFirst();
        }

        System.out.println(Arrays.toString(answerInt));


    }
}
