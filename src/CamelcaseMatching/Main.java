package CamelcaseMatching;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBa";
        List<Boolean> list =new ArrayList();
        for(String str:queries){
            list.add(bool(str,pattern));
        }
        System.out.println(list);
    }
    static Boolean bool(String str,String pattern){
        int i = 0;
        for(char c: str.toCharArray()){
            if(i < pattern.length() && c == pattern.charAt(i)){
                i++;
            }

            else if(c < 'a'){
                return false;
            }
        }
        return i == pattern.length();
    }

}
