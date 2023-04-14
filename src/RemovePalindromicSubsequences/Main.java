package RemovePalindromicSubsequences;

public class Main {
    public static void main(String[] args) {
        String s = "bbbbbbabaab";
        if(s.length() == 0) {
            System.out.println(0);;
        }

        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println(2);
                return;
            }
        }

        System.out.println(1);

    }
}