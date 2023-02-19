/*
 * Assignment: Assignment 7
 * Description: Working with arrays
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Arrays;

public class Assignment7 {

    //Start of main method
    public static void main(String[] args) {

        //Print the sum8 method and calling it
        System.out.println("Once you implement sum8 method, it should print out: false");
        int[] array0 = {3, 5, 6};
        System.out.println("Your implementation of sum8 method printed out: " + sum8(array0));

        //Print the luck88 method and calling it
        System.out.println("\nOnce you implement lucky88 method, it should print out: false");
        int[] array1 = {1, 3, 5, 6};
        System.out.println("Your implementation of lucky88 method printed out: " +lucky88(array1));

        //Print the plusTwo array method and calling it
        System.out.println("\nOnce you implement plusTwo method, it should print out: [1, 9, 2, 4, 6]");
        int[] array2 = {1, 9};
        int[] array3 = {2, 4, 6};
        // We use a method called toString to print the array. Do not worry about it.
        System.out.println("Your implementation of lucky13 method printed out: " + Arrays.toString(plusTwo(array2, array3)));
    }

    //Begin of sum8 method
    public static boolean sum8(int[] array0) {

        //For each loop to iterate through the array and calculate its sum
        for (int j : array0) {
            int sum = 0;
            sum += j;

            //If statement to check whether the sum is 8 and return accordingly
            if (sum == 8) {
                //Return true if the condition gets fulfilled
                return true;
            }
        }
        //Return false in the other case
        return false;
    }


    //Begin of lucky88 method
    public static boolean lucky88(int[] array1) {

        //Declaration and assignment of variable to calculate the occurrence of 8
        int digit8 = 0;

        //For each loop to iterate and add if the digit is 8
        for (int j : array1) {

            //If statement to calculate the occurrence of 8
            if (j == 8) {
                digit8++;
            }

            //If to check whether array contains at least two eight and if yes then return true
            if (digit8 >= 2) {
                //Return true if the condition gets fulfilled
                return true;
            }
        }
        //Return false in the other case
        return false;
    }

    //Begin of plusTwo method
    public static int[] plusTwo(int[] array2, int[] array3) {

        //Declaration of new array
        int[] newarray = new int[array2.length + array3.length];

        //For loop to assign values to the new array of the first array
        for (int i = 0; i < array2.length; i++){
            newarray[i] = array2[i];
        }
        //For loop to assign values to the new array of the second array
        for (int i = array2.length; i< (array3.length+ array2.length); i++){
            newarray[i] = array3[i- array2.length];
        }

        //Returning the new array
        return newarray;
    }
}
