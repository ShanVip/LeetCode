package ScoreofParentheses;

import java.util.Stack;

    public class Main {
    public static void main(String[] args) {
        String s = "()()()";

        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(2 * score, 1);
            }
        }
        System.out.println(score);;
    }
}
