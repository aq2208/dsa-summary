package src.algorithms.numberbaseconversion;

public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 50;
        System.out.println(decimal + " in octal is: " + decimalToOctal(decimal));
    }

    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();

        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }

        return octal.toString();
    }
}
