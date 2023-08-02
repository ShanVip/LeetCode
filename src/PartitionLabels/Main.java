package PartitionLabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";

        List<Integer> answer = new ArrayList<>();


        int max=-1;
        List<Integer> list=new ArrayList<>();
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                int getMax=maxIndex(s,s.charAt(i),i);
                map.put(s.charAt(i),getMax==i?i:getMax);
                if(getMax>max)max=getMax;
            }
            count++;
            if(max==i){
                list.add(count);
                count=0;
            }
        }

        System.out.println(list);

    }

    public static int maxIndex(String str,char c,int l){
        int max=-1;
        for(int i=l;i<str.length();i++){
            if(str.charAt(i)==c && max<i){
                max=i;
            }
        }
        return max;
    }

}
