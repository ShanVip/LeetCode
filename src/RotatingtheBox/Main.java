package RotatingtheBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[][] box = {{'#','.','*','.'},
                        {'#','#','*','.'}};

        for (int i = 0; i < box.length; i++) {
            int stone = 0;
            int empty = 0;
            int x = 0;
            for (int j = 0; j < box[i].length; j++) {
               if (box[i][j] == '#'){
                   stone++;
               } else if (box[i][j] == '.') {
                   empty++;
               } else {
                   while (empty>0){
                       box[i][x] = '.';
                       empty--;
                       x++;
                   }
                   while (stone>0){
                       box[i][x] = '#';
                       stone--;
                       x++;
                   }
                   box[i][x] = '*';
                   x++;
               }

            }
            if (stone>0||empty>0){
                while (empty>0){
                    box[i][x] = '.';
                    empty--;
                    x++;
                }
                while (stone>0){
                    box[i][x] = '#';
                    stone--;
                    x++;
                }
            }

        }

        int rows = box.length;
        int cols = box[0].length;


        char[][] rotatedArray = new char[cols][rows];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedArray[j][rows - 1 - i] = box[i][j];
            }
        }

        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.println(Arrays.toString(rotatedArray[i]));
        }


    }
}
