package LetterCasePermutation;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        String s = "a1b2";

        LinkedList<String> res=new LinkedList<>();
        res.add(s);
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                int size=res.size();
                while(size-- >0){
                    String str=res.poll();
                    String left=str.substring(0,i);
                    String right=str.substring(i+1,n);
                    res.add(left+Character.toLowerCase(c)+right);
                    res.add(left+Character.toUpperCase(c)+right);
                }
            }
        }
        System.out.println(res);
    }
}