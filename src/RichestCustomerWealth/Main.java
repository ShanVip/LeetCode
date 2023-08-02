package RichestCustomerWealth;

public class Main {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int answer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int helper = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                helper += accounts[i][j];
            }
            if (helper > answer){
                answer = helper;
            }

        }

        System.out.println(answer);
    }
}
