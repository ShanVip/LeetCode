package MaximumNumberofWordsFoundinSentences;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int answer = 0;
        for (int i = 0; i < sentences.length; i++) {
            sentences[i].strip();
            char[] helper = sentences[i].toCharArray();
            int count = 0;
            for (int j = 0; j < helper.length; j++) {
                if (helper[j] == ' ' || j == helper.length-1){
                    count++;
                }
            }
            if (count > answer){
                answer = count;
            }
        }

        System.out.println(answer);

    }
}
