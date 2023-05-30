package ExecutionofAllSuffix;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[] startPos = {0,1};

        int[] currentPos = startPos.clone();
        String s = "RRDDLU";
        int[] answer = new int[s.length()];


        char[] charArray = s.toCharArray();

        System.out.println(Arrays.toString(charArray));
        int counter = 0;
        int tester = 0;
        while(charArray[charArray.length-1]!='x'){
            for (int i = 0; i < charArray.length; i++) {

                if (charArray[i]=='R'){
                        currentPos[1]++;
                        if(currentPos[1]>n-1 || currentPos[1]<0){
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                        }else if(i == charArray.length-1) {
                            counter++;
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                    }
                    counter++;
                    }

                    if (charArray[i]=='L'){
                        currentPos[1]--;
                        if(currentPos[1]>n-1 || currentPos[1]<0){
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                        }else if(i == charArray.length-1) {
                            counter++;
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                        }
                        counter++;
                    }
                    if (charArray[i]=='U'){
                        currentPos[0]--;
                        if(currentPos[0]>n-1 || currentPos[0]<0){
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                        }else if(i == charArray.length-1) {
                            counter++;
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                        }
                        counter++;
                    }

                    if (charArray[i]=='D'){
                        currentPos[0]++;
                        if(currentPos[0]>n-1 || currentPos[0]<0){
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                        }else if(i == charArray.length-1) {
                            counter++;
                            answer[tester] = counter;
                            charArray[tester] = 'x';
                            currentPos = startPos.clone();
                            counter=0;
                            tester++;
                            break;
                        }
                        counter++;
                    }

            }
        }

        System.out.println(Arrays.toString(answer));

    }
}
