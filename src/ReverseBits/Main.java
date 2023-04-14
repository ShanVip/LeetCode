package ReverseBits;

public class Main {
    public static void main(String[] args) {
        int n = 43261596;
        String binaryString = Integer.toBinaryString(n);
        while (binaryString.length()<32){
            binaryString="0" + binaryString;
        }

        String reversedStrNum = new StringBuilder(binaryString).reverse().toString();

        int decimal = Integer.parseInt(reversedStrNum, 2);

        System.out.println(binaryString);
        System.out.println(reversedStrNum);

        System.out.println(decimal);



    }
}
