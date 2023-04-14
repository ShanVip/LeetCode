package RemovingStarsFromaString;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        char[] charArray = s.toCharArray();

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '*'){
                deque.addLast(charArray[i]);
            }else deque.removeLast();
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.removeFirst());
        }

        String str = sb.toString();
        System.out.println(str);
    }
}
