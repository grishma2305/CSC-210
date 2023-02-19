/*
 * Lab: Review Lab 1
 * Description: Using scanner, method, if-else statement
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class ReviewLab1 {

    //Declaration of main method
    public static void main(String[] args){

        //Create Scanner object
        Scanner inputObj = new Scanner(System.in);

        //Prompt user to enter number
        System.out.print("Enter a number between 1-100: ");
        int userInput = inputObj.nextInt();

        //If to check the validity of the number entered and if it is greater than 100 then terminate it
        if (userInput>100){
            System.out.println("Invalid input!!");
        }
        //To check if the number is divisible by 4 and if yes then call the writeCard method
        else if (userInput % 4 == 0) {
            writeCard();
        }
        //If not divisible by 4 then call callDraw method
        else {
            callDraw();
        }
    }

    //Start of writeCard method
    public static void writeCard(){

        //Creating a scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user to enter word
        System.out.println("Please enter a word: ");
        String userWord = input.nextLine();

        System.out.println("************************");

        //Outer for loop to print 3 rows
        for (int i = 0; i < 3; i++) {

            //Inner for loop to print 3 columns
            for (int j = 0; j < 3; j++) {

                //Printing the word entered by user
                System.out.print(userWord + " ");
            }
            //Printing blank line to make a pattern
            System.out.println();
        }
        //Printing ending statement
        System.out.println("Have a nice day!");
        System.out.println("************************");
    }

    //Start of callDraw method
    public static void callDraw(){

        //Printing out the rectangle
        System.out.println(" ---- ");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ---- ");
    }
}
