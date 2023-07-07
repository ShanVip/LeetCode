package TeemoAttacking;

public class Main {
    public static void main(String[] args) {
        int[] timeSeries = {1,4};
        int duration = 2;

        int answer = 0;
        for (int i = 0; i <timeSeries.length-1 ; i++) {
            if (timeSeries[i+1]-timeSeries[i] < duration){
                answer += timeSeries[i+1]-timeSeries[i];
            }
            else answer += duration;
        }
        answer+=duration;
        System.out.println(answer);
    }
}
