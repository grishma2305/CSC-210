/*
 * Project: Project 2
 * Description: Sorting three numbers in ascending order
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class ThreeNumSort {

    //Declaration of Main Method
    public static void main(String[] args) {

        //Creating a Scanner Object
        Scanner input = new Scanner(System.in);

        //Declaration of a variable to swap values
        int temp;

        //Prompt user to enter 1st integer
        System.out.print("Please enter the first integer : ");
        int no1 = input.nextInt();

        //Prompt user to enter 2nd integer
        System.out.print("Please enter the second integer : ");
        int no2 = input.nextInt();

        //Prompt user to enter 3rd integer
        System.out.print("Please enter the third integer : ");
        int no3 = input.nextInt();

        //Nested if statements in order to sort the numbers
        if (no1>no2){
            temp = no1;
            no1 = no2;
            no2 = temp;
        }
        if (no1>no3){
            temp = no1;
            no1 = no3;
            no3 = temp;
        }
        if (no2>no1){
            temp = no2;
            no2 = no1;
            no1 = temp;
        }
        if (no3>no1){
            temp = no3;
            no3 = no1;
            no1 = temp;
        }
        if (no3>no2){
            temp = no3;
            no3 = no2;
            no2 = temp;
        }

        //Printing the final result that is the sorted numbers.
        System.out.println("Three numbers in ascending order are " + no3 + ", " + no2 + ", " + no1 + ".");

    }

}
