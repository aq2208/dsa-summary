package src.Algorithms.NumberBasesConversion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 50;
        System.out.println(decimal + " in binary is: " + decimalToBinary(decimal));
    }

    public static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }

        //insert(index, value)
        //index: the index at which the new characters or string should be inserted
        //it represents the position within the StringBuilder where the insertion will occur
        //index 0 correspond to the beginning of the StringBuilder

        return binary.toString();
    }
}
