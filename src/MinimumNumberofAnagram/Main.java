package MinimumNumberofAnagram;

public class Main {
    public static void main(String[] args) {
        String s = "leetcode", t = "practice";

        int count = minSteps(s, t);
        System.out.println(count);

    }

    private static int minSteps(String s1, String s2) {
        int arr[]=new int[26];
        int brr[]=new int[26];

        for(int i=0;i<s1.length();i++) arr[s1.charAt(i)-'a']++;

        for(int i=0;i<s2.length();i++) brr[s2.charAt(i)-'a']++;

        int count=0;

        for(int i=0;i<26;i++)count+=Math.abs(arr[i]-brr[i]);

        return count/2;
    }
}


