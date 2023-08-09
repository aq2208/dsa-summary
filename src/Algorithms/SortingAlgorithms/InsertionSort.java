package src.Algorithms.SortingAlgorithms;

import java.util.Random;

public class InsertionSort {

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

    //Insertion Sort idea: iterate through each elements in the array, and insert it to the proper place in the sorted partition of the array
    //How to code: Start from the second element of the array (cause the first element is already in the sorted partition)
    //With each element, we copy it to a temp variable, and then we compare it with all the element(s) before it,
    //from the nearest element till the first element of the array
    //If the element is greater than the temp variable, shift it to the right 1 step, then continue to compare backwards
    //Stop when we reach the first place of the array, or the element is less than the temp variable,
    //and then we insert the temp to the place we stop
    //Time Complexity: O(n^2)
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {  //iterate through all the array (exclude the first element)
            //temp variable to store the value of the current considering element
            int currentValue = nums[i];

            //compare the currentValue with element(s) backwards, to the first element of the array
            int j = i - 1;  //set j to the element right before the currentValue
            while (j >= 0 && nums[j] > currentValue) {  //iterate towards the beginning of the array and do the shifting right
                nums[j + 1] = nums[j];
                j--;
            }
            //Stop the iteration till reach the beginning of the array, or found the element less than currentValue
            //Set the element right after the stop position equal the currentValue
            nums[j + 1] = currentValue;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
