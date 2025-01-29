package src.algorithms.sorting;

public class QuickSort {
    //Quick Sort idea: Choose one of the number in the array as the pivot (choose the last element of the array)
    //After choosing a pivot, move all the elements in the array that are less than the pivot to the left of the pivot
    //And move all the elements that are greater than the pivot to the right of the pivot
    //This process is called partitioning
    //After this, the pivot is in the right spot in the array (left will less than it, right will greater than it)
    //After the partitioning, recursively redo the quicksort all the values to the left of the pivot
    //and all the values to the right of the pivot (choose the new pivot for each subarray and do the quicksort again, recursively)
    //Time complexity: O(n logn)
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }

        //Choose the pivot
        int pivot = arr[highIndex];

        //Partitioning: when we chose the pivot, we leave it there, and we consider the rest of the array
        //in the rest part of the array, we set 2 pointers, left pointer to the left most, and right pointer to the right most
        //with the left pointer, walk through the array one element at a time,
            //until we find the first element greater than the pivot, stop the left pointer at that position
        //with the left pointer, walk through the array one element at a time to the left,
            //until we find the first element less than the pivot, stop the right pointer at that position
        //Then we swap the right pointer's value to the left pointer's value
        //And then we continue the process at the position we just stop
        //Until the left pointer meet the right pointer at the same position, we stop the process
        //And finally we swap the pivot with the value in the same position. So the partitioning is complete
        //After the partitioning, we recursively do the quick sort with the left of the pivot and the right of the pivot

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        swap(arr, leftPointer, highIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
