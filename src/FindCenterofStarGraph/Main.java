package FindCenterofStarGraph;

public class Main {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{4,2}};
        int answer = 0;
        if (edges[0][0] == edges[1][0] ||edges[0][0] ==  edges[1][1]){
            answer = edges[0][0];
        }else answer = edges[0][1];

        System.out.println(answer);

    }
}
