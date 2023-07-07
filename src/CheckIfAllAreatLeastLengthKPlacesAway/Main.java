package CheckIfAllAreatLeastLengthKPlacesAway;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,0,1};
        int k = 2;
        int point = 1000000;
        boolean answer = true;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                    if (point<k){
                        answer=false;
                        break;
                    }
                    point = 0;
                }else {
                    point++;
                }
            }

        System.out.println(answer);

        }
    }

