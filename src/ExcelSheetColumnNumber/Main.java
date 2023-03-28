package ExcelSheetColumnNumber;

public class Main {
    public static void main(String[] args) {
        String columnTittle = "ZY";
        int sum = 0;

        for (int i = columnTittle.length()-1; i >=0; i--) {
          char chr =  columnTittle.charAt(i);
          int ascii = (int) chr - (int) 'A' + 1;

          sum = (int) (ascii*Math.pow(26, (columnTittle.length()-1)-i)) + sum;

        }

        System.out.println(sum);

    }
}
