package src.algorithms.numberbaseconversion;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        String hexadecimal = "A";
        System.out.println(hexadecimal + " in decimal is: " + hexadecimalToDecimal(hexadecimal));
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        int power = 1;

        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char digit = hexadecimal.charAt(i);

            if (Character.isDigit(digit)) {
                decimal += (digit - '0') * power;
            } else {
                decimal += (Character.toUpperCase(digit) - 'A' + 10) * power;
            }

            power *= 16;
        }

        return decimal;
    }
}
