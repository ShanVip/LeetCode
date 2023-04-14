package VerifyinganAlienDictionary;

public class Main {
    public static void main(String[] args) {
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        boolean answer = true;

        int[] charOrder = new int[26];
        for (int i = 0; i < order.length(); i++) {
            charOrder[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int len = Math.min(word1.length(), word2.length());
            for (int j = 0; j < len; j++) {
                char ch1 = word1.charAt(j);
                char ch2 = word2.charAt(j);
                if (charOrder[ch1 - 'a'] < charOrder[ch2 - 'a']) {
                    break;
                } else if (charOrder[ch1 - 'a'] > charOrder[ch2 - 'a']) {
                    answer = false;
                }

            }
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                answer = false;
            }
        }
        System.out.println(answer);
    }
}