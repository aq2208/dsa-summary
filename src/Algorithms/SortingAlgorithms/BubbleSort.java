package src.Algorithms.SortingAlgorithms;

import java.util.Random;

public class BubbleSort {

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


        System.out.println("\nAfter: ");
        printArray(arr);
    }

    //Bubble Sort idea: iterate through the array, and compare each number with the number after it
    //if those two numbers are not in the right order, swap them
    //after each iteration, the maximum of the list in that iteration will bubble to the end of the array
    //and continue to iterate and compare items (exclude the last element of the previous pass)
    //until it go through the list n times, it ends (because each time, one item is sorted, so after n times, n items are sorted, or the entire array is sorted)
    public static void bubbleSort(int[] arr) {
        //outer loop is to set the iterations
        for (int i = 0; i < arr.length - 1; i++) {  //arr.length - 1 because we look at the number and the number after it, so the number near the last number will look at the last number too
            //inner loop is to compare items and swap
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Alternative version: we can set the terminate condition to the sorting
    //Terminate condition: the sorting will end if there is no swap needed in the entire array
    public static void bubbleSort2(int[] arr) {
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swappedSomething = true;
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
