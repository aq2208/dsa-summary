package src.Algorithms.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibonacci(7));
    }

    public static int findFibonacci(int number) {
        if(number == 1 || number == 0) {
            return 1;
        } else {
            return findFibonacci(number - 1) + findFibonacci(number - 2);
        }
    }
}
