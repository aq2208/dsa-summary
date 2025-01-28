package src.datastructures;

import java.util.Arrays;

public class StaticArray {

    public static void main(String[] args) {

        // array = used to store multiple values in a single variable
        // fixed number of elements (you need to provide the number of elements when creation)

        // Array declaration - 2 ways
        int[] arr;  // recommend
        int arr2[];

        // Create an array - provide the values in the array when creating
        // data_structures.Array can hold both primitives data types and object data types (also wrapper class)
        String[] cars = {"BMW", "Honda", "Mazda"};
        double[] myCoursesGrades = {8.5, 9.1, 7.3, 8.6, 10.0};


        // Create an array - not provide the values when creating - but must provide the size of array
        Integer[] numbers = new Integer[10];
        String[] friendsArray = new String[4];

        // Access the element(s) of the array by indexes (starting at 0) / Get the values of the elements
        System.out.println(cars[2]);  // get the element with index=2, which is the third element's value in the array
        System.out.println(myCoursesGrades[3]);  // get the fourth element's value in the array

        //System.out.println(friendsArray[0]);  // get null because this array's elements is empty

        // Change (or Update, or Set) value to element(s) in an array, by using index
        friendsArray[0] = "Anh Quan";
        cars[2] = "KIA RIO";
        numbers[9] = 10000;

        // Print the whole array out (by default it will print out the memory location of the array)
        System.out.println(cars);
        // If you want to print out all the elements of an array you need to use for loop or use Arrays.toString() method
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println(Arrays.toString(cars));
        // Another way is by using Arrays.stream
        Arrays.stream(cars).forEach(System.out::println);

        // Get the size of an array (number of elements in that array)
        System.out.println(numbers.length);
        System.out.println(myCoursesGrades.length);

        // We can't increase or decrease the size of an array
        // But we can delete a value from the array, but delete operation in array is very hard

        // 2D Array - Multi-dimensional Array - or Array of Arrays
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));

        char[][] board2 = new char[][] {
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'},
        };
        System.out.println(Arrays.deepToString(board2));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(matrix[0][2]); // matrix[row][col]
    }

}
