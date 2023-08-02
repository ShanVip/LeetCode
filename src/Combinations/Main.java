package Combinations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> answer = new ArrayList<>();
        List<List<Integer>> current = new ArrayList<>();
        int n = 4;
        int k = 2;
        int z = 1;

        while (current.size() < n) {
            current.add(List.of(z++));
        }

        if (k == 1) {

            System.out.println(current);

        }


        List<List<Integer>> nxt = new ArrayList<>();
        while (!current.isEmpty()) {
            nxt.clear();
            for (List<Integer> curEl : current) {
                if (curEl.size() == k) {
                    continue;
                }
                for (int el = curEl.get(curEl.size() - 1) + 1; el <= n; el++) {
                    List<Integer> newCombination = new ArrayList<>(curEl);
                    newCombination.add(el);
                    nxt.add(newCombination);
                    if (newCombination.size() == k) {
                        answer.add(newCombination);
                    }
                }
            }
            current = new ArrayList<>(nxt);
        }

            System.out.println(answer);

    }
}
