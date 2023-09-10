package KClosestPointstoOrigin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] points = {{1,2},{1,0},{0,0}};
        int k =1;

        double[] helper = new double[points.length];

        for (int i = 0; i < points.length; i++) {

                 helper[i] = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);

        }

        for (int i = 0; i < helper.length - 1; i++) {
            for (int j = 0; j < helper.length - i - 1; j++) {
                if (helper[j] > helper[j + 1]) {
                    double tempHelper = helper[j];
                    helper[j] = helper[j + 1];
                    helper[j + 1] = tempHelper;

                    int[] tempPoint = points[j];
                    points[j] = points[j + 1];
                    points[j + 1] = tempPoint;
                }
            }
        }

        int[][] answer = new int[k][];

        for (int i = 0; i < answer.length ; i++) {
            answer[i] = points[i];
        }


    }

}

