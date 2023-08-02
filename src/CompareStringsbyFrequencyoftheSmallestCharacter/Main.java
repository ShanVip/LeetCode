package CompareStringsbyFrequencyoftheSmallestCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] queries = {"bbbxx","cc"};
        String[] words = {"a","aa","aaa","aaaa"};

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        adapter(queries, list1);
        adapter(words, list2);


        int[] answer = new int[queries.length];

        for (int i = 0; i < list1.size(); i++) {
            int countAnswer = 0;
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i) < list2.get(j)){
                    countAnswer++;
                }
            }
            answer[i] = countAnswer;
        }

        System.out.println(Arrays.toString(answer));


    }

    static void adapter(String[] str, List<Integer> list) {
        for (int i = 0; i < str.length; i++) {
            int counter1 = 1;
            char[] que = str[i].toCharArray();
            Arrays.sort(que);
            for (int j = 1; j < que.length; j++) {
                if (que[j] == que[j - 1]) {
                    counter1 += 1;
                } else break;
            }
            list.add(counter1);
        }
    }
}
