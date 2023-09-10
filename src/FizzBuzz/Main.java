package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> answer = new ArrayList<>();
        int n = 3;
        int counter = 1;
        while (counter<=n){

            if(counter%3==0&counter%5==0){
                answer.add("FizzBuzz");
            }else if (counter%5==0){
                answer.add("Buzz");
            } else if (counter%3==0){
                answer.add("Fizz");
            }else answer.add(String.valueOf(counter));

            counter++;
        }

        System.out.println();

    }
}
