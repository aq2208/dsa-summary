package src.algorithms.sorting;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        //Randomly create an array of numbers to perform sorting algorithm
        Random rand = new Random();
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }

        System.out.println("Before: ");
        printArray(arr);

        //Sorting algorithm here
        mergeSort(arr);

        System.out.println("\nAfter: ");
        printArray(arr);
    }

    //Merge Sort idea: divide the array into the single-element array for each element of the initial array
    //Complexity: O(n*logn)
    public static void mergeSort(int[] numbers) {
        int length = numbers.length;

        if (length < 2) {
            return;
        }

        //divide array
        int midIndex = length/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }

        for (int i = midIndex; i < length; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //merge 2 sorted arrays into 1 large sorted array
        merge(numbers, leftHalf, rightHalf);
    }

    private static void merge (int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            } else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
