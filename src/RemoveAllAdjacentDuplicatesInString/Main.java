package RemoveAllAdjacentDuplicatesInString;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "aababaab";
        Stack<Character> stack = new Stack<>();

        for (char chr : s.toCharArray()) {
            if (!stack.isEmpty()&&stack.peek()==chr){
                stack.pop();
            }else{
                stack.add(chr);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        String result = sb.reverse().toString();
        System.out.println(result);




    }

}
