package src.algorithms.numberbaseconversion;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimal = 50;
        System.out.println(decimal + " in hexadecimal is: " + decimalToHexadecimal(decimal));
    }

    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (decimal > 0) {
            hexadecimal.insert(0, hexDigits[decimal % 16]);
            decimal /= 16;
        }

        return hexadecimal.toString();
    }
}
