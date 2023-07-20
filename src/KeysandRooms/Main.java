package KeysandRooms;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[][] rooms = {{1,3},{3,0,1},{2},{0}};

        Set<Integer> keys = new HashSet<>();
        boolean answer = true;

        for (int j = 0; j < rooms[0].length; j++) {
            keys.add(rooms[0][j]);
        }

        System.out.println(keys);

        for (int i = 1; i < rooms.length; i++) {
                if (keys.contains(i)){
                    for (int j = 0; j < rooms[i].length; j++) {
                        keys.add(rooms[i][j]);
                    }
                } else {
                    answer = false;
                    break;
                }
            }
        
             System.out.println(answer);

        }

    }
