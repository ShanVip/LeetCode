package FindPlayersWithZeroorOneLosses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> winGame = new ArrayList<>();
        List<Integer> loseGame = new ArrayList<>();

        HashMap<Integer, Integer> wonMap = new HashMap<>();
        HashMap<Integer, Integer> loseMap = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            int counter = 0;
            counter = wonMap.getOrDefault(matches[i][0], 0);
            wonMap.put(matches[i][0],counter + 1);
            counter = loseMap.getOrDefault(matches[i][1], 0);
            loseMap.put(matches[i][1],counter + 1);
        }

      for (int key : wonMap.keySet()){
          if (!loseMap.containsKey(key)){
              winGame.add(key);
          }
      }
      for (int key : loseMap.keySet()){
          if (loseMap.get(key)==1){
              loseGame.add(key);
          }
      }
        Collections.sort(winGame);
        Collections.sort(loseGame);

        answer.add(winGame);
        answer.add(loseGame);


    }
}
