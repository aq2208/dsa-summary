package src.algorithms.recursion;

public class SumNNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return n;
        } else {
            return sum(n - 1) + n;
        }
    }
}
