/*
 * Assignment: Assignment 4A
 * Description: Calculating Factorial
 * Name: Thumar Grishma Maheshbhai
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class Assignment4A {

    public static void main(String[] args) {

        //Declaration of Scanner object
        Scanner input = new Scanner(System.in);

        //Declaration of two variables to store the user input and compute the factorial
        int userInput;
        int factorial = 1;

        //Prompt the user to enter number whose factorial they need to find
        System.out.print("Enter the number to find it's factorial : ");
        userInput = input.nextInt();

        //For loop initiating from int i=1 to i less than or equal to the number entered by user to get the correct factorial
        for (int i = 1; i <= userInput; i++) {

            //Computation of the value of factorial
            factorial = factorial * i;
        }

        //Printing out the factorial value that the final answer
        System.out.println("Factorial is " + factorial);
    }
}
