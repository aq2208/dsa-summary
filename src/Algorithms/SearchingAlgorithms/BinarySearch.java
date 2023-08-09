package src.Algorithms.SearchingAlgorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 7, 9, 11};

        System.out.println(binarySearch(arr, 9));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 6));

        //use binary search in 1 single line of code using Java built in library
        System.out.println(Arrays.binarySearch(arr, 9));

    }

    private static int binarySearch(int[] numbers, int target) {
        //using two pointers point to the first and the last index of the array
        int low = 0;
        int high = numbers.length - 1;

        //keep looping until the two pointers across each other (not meet)
        //we keep narrowing the distance between the two pointers together
        //until they meet at the last element of the array, or they across each other => target not found
        while (low <= high) {
            //identify the middle of the considering interval
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if(target == middleNumber) {
                return middlePosition;
            }
            if(target < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }

        return -1;
    }
}
