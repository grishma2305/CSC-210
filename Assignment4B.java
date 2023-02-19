/*
 * Assignment: Assignment 4B
 * Description: Printing odd numbers between the declared value
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class Assignment4B {

    //Declaration of main method
    public static void main(String[] args) {

        //Creating a Scanner Object
        Scanner input = new Scanner(System.in);

        //Declaration of necessary variables to store the user input
        int no1, no2;

        //Prompt the user to enter the smaller and the larger number
        System.out.print("Enter smaller number: ");
        no1 = input.nextInt();
        System.out.print("Enter larger number: ");
        no2 = input.nextInt();

        //Print statement to indicate the odd numbers
        System.out.println("Odd numbers between them are: ");

        //For loop initiating from smaller to larger number in order to print all the odd numbers between them
        for (int i=no1; i<=no2; i++ ){

            //If to check whether the number is odd or not
            if(i%2!=0){

                //Printing the odd numbers
                System.out.println(i);
            }
        }

    }
}
