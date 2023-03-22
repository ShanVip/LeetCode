package LongestCommonPrefix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"dog","racecar","car"};
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int ind = 0;

        while(ind<s1.length()){
            if(s1.charAt(ind)==s2.charAt(ind)){
                ind++;
            }else break;
        }
        System.out.println(s1.substring(0,ind));

        }

    }

