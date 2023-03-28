package AddDigits;

public class Main {
    public static void main(String[] args) {
        int num = 88;
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        int sum = num;

        while (digits.length >= 2) {
            sum = 0;
            for (int i = 0; i < digits.length; i++) {

                sum += digits[i];

            }
            digits = Integer.toString(sum).chars().map(c -> c - '0').toArray();

        }
        System.out.println(sum);
    }
}