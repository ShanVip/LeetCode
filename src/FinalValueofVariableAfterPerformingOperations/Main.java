package FinalValueofVariableAfterPerformingOperations;

public class Main {
    public static void main(String[] args) {
       String[] operations = {"--X","X++","X++"};

       int answer = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == "--X" || operations[i] == "X--" ){
                answer -= 1;
            }
            if (operations[i] == "X++" || operations[i] == "++X"){
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
