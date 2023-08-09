package src.Algorithms.NumberBasesConversion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "101010";
        System.out.println(binary + " in decimal is: " + binaryToDecimal(binary));
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 1;

//        for (int i = binary.length() - 1; i >= 0; i--) {
//            int digit = binary.charAt(i) - '0';
//            decimal += digit * Math.pow(2, power);
//            power++;
//        }

        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += Integer.parseInt(binary.substring(i, i+1)) * power;
            power *= 2;
        }

        return decimal;
    }
}
