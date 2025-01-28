package src.algorithms.numberbaseconversion;

public class OctalToDecimal {
    public static void main(String[] args) {
        String octal = "32";
        System.out.println(octal + " in decimal is: " + octalToDecimal(octal));
    }

    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int power = 1;

        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += Integer.parseInt(octal.substring(i, i+1)) * power;
            power *= 8;
        }

        return decimal;
    }
}
