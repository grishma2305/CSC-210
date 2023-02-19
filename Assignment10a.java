/*
 * Assignment: Assignment 10a
 * Description: Two Dimensional array
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

public class Assignment10a {
    //Start of the main method
    public static void main(String[] args) {

        // Below is a two-dimensional array with different row length
        int[][] matrix = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        //Calling a method and passing the array
        matrixOperations(matrix);
    }
    //End of the main method

    //Start of the matrix operations method
    public static void matrixOperations(int[][] matrix){

        //For loops to iterate through the whole 2-Dimensional array
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                //Print put the numbers in array row by row
                System.out.print(anInt + " ");
            }
            //Print out the length of the row
            System.out.println(" - Length: " + ints.length);
        }
        //Print out the total number of rows
        System.out.println("Total rows in the two-dimensional array: " + matrix.length);
    }
    //End of the matrix operations method
}
