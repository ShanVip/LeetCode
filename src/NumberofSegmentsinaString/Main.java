package NumberofSegmentsinaString;

public class Main {
    public static void main(String[] args) {
        String s = "Hello world";
        s.strip();
        char[] buffer = s.toCharArray();
        int answer = 0;
        for (int i = 0; i < buffer.length; i++) {
            if(buffer[i]==' '){
                answer++;
            }
        }
        System.out.println(answer+1);
    }
}
