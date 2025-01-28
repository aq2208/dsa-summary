package src.algorithms.sorting;

import java.util.Random;

public class SelectionSort {

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

    //Selection sort idea: During each iteration we'll select the smallest item from the unsorted partition
    //and move it to the sorted partition
    //notes that sorted partition and unsorted partition are still within the array
    //Time Complexity: O(n^2)
    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int min = arr[i];  //begin the iteration, set the current minimum to the first item in the unsorted partition
            int indexOfMin = i;

            //iterate from the first item in the unsorted partition through out the entire partition
            //to find the minimum in the unsorted partition
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexOfMin = j;
                }
            }

            //after we found the minimum in the unsorted partition, and move it to the sorted partition (to the end of sorted partition)
            //by swapping it with the first item in the unsorted list, that part will become new part of sorted partition
            swap(arr, i, indexOfMin);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
