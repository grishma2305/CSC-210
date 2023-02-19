/*
 * Lab: Lab 05
 * Description: Fibonacci series
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //Creating a Scanner Object
        Scanner input = new Scanner(System.in);

        //Declaration and Assignment of Variable
        int num1 = 0;
        int num2 = 0; //First item in sequence
        int num3 = 1; //Sum of num1+num2, second item in sequence
        int userInput;

        //Prompt user to enter the input
        System.out.println("Enter number of terms for Fibonacci Series: ");
        userInput = input.nextInt();

        //If else statement for validation that is to check number need to be greater than 0 and less than 20
        if(userInput>=20||userInput<=0){
            System.out.println("Please enter a number less than 20 and greater than 0");
        }
        //executes if number is less than 20
        else {
            //Printing Fibonacci series
            System.out.println("Fibonacci series is: ");

            //For loop iterating through all items in fibonacci
            for(int i=0; i<userInput; i++){

                num1 = num2; //First item equals to second item
                num2 = num3; //Second item equals to third item
                num3 = num1+num2; //Third item equals to sum of first and second item

                //Printing the first item with space that is the Fibonacci series
                System.out.print(num1 + " ");
            }
        }
    }
}
