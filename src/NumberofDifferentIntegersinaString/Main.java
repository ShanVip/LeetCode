package NumberofDifferentIntegersinaString;

import java.util.HashSet;



public class Main {
    public static void main(String[] args) {
       String word = "a123bc34d8ef34";
       char[] buffer = word.toCharArray();

        HashSet<String> set = new HashSet<>();

        String temp = "";

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);

            if(c>='0'&&c<='9'){
                if(temp.equals("0")) temp = "";

                temp += c;
            }
            else if(temp.length()!=0){
                set.add(temp);
                temp = "";
            }
        }

        if(temp.length()!=0){
            set.add(temp);
            temp = "";
        }

        System.out.println(set.size());
    }
}