package LengthofLastWord;

public class Main {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        s = s.trim();
        System.out.println(s);
        char x = ' ';
        int count = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != x){
                    count++;
            }else break;
        }

        System.out.println(count);

    }
}
