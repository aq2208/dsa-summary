package src.others.om;

import java.util.ArrayList;
import java.util.List;

public class StringChallenge {
    public static void main(String[] args) {
        String str = "42";
        String result = stringChallenge(str);
        System.out.println(result);
    }

    //The function takes in a String "str" as input, which represents a decimal number.
    //The goal of the code is to convert this decimal number into its binary representation
        //and then back into that decimal number
    public static String stringChallenge(String str) {
        long num = Long.parseLong(str);
        //the List bits is used to store the binary representation of the decimal number
        List<Long> bits = new ArrayList<>();

        //convert the num to binary process
        while (num > 0) {
            bits.add(num % 2);
            num /= 2;
        }

        //check if the binary representation is multiple of 8, if not append additional 0s to the head of the list
        //this process to make sure the binary representation can be split into bytes accurately
        while (bits.size() % 8 != 0) {
            bits.add(0L);
        }

        System.out.println("binary bits: " + bits.toString());

        long res = 0;  //final result (in decimal)
        long pow = 1;  //the factorial of 2 (increasing by each iteration)

        //the process to convert the binary representation back to decimal
        for (int i = 0; i < bits.size(); i++) {
            res += pow * bits.get(i);
            pow *= 2;
        }

        str = String.valueOf(res);

        return str;
    }
}
