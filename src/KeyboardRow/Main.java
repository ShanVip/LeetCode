package KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        int[] rowMap = new int[26];
        String[] rows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};

        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                rowMap[c - 'A'] = i;
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            int row = rowMap[word.toUpperCase().charAt(0) - 'A'];
            boolean onSameRow = true;
            for (char c : word.toUpperCase().toCharArray()) {
                if (rowMap[c - 'A'] != row) {
                    onSameRow = false;
                    break;
                }
            }
            if (onSameRow) {
                result.add(word);
            }
        }

        System.out.println(result);
    }
}
