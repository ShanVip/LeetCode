package FirstUniqueCharacterinaString;

public class Main {
    public static void main(String[] args) {
        String s = "aabb";
        int answer = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i!=j){
                    break;
                }
                if (j==s.length()-1 && s.charAt(i) != s.charAt(j)){
                    answer = i;
                }
            }
            if (answer!=-1){
                break;
            }
        }

        System.out.println(answer);

    }
}
