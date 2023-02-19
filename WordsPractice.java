/*
 * Lab: Lab 4
 * Description: Word Practice
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class WordsPractice {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner inputObj = new Scanner(System.in);

        //Print out Part 1
        System.out.println("**************** PART 1 ***************");

        //Prompt user 1 to enter name
        System.out.print("User 1, please enter your name: ");
        String user1 = inputObj.nextLine();

        //Prompt user 2 to enter name
        System.out.print("User 2, please enter your name: ");
        String user2 = inputObj.nextLine();

        //Printing blank line
        System.out.println();

        //Printing the length of user1 and user2 using length() method
        System.out.println("User 1, your name's length is " + user1.length());
        System.out.println("User 2, your name's length is " + user2.length());

        //Printing blank line
        System.out.println();

        //If else statement to check if the name contains "me" or not using contains() method
        if ((user1.contains("me")) || (user2.contains("me"))){
            System.out.println("Me found in user!");
        }
        else {
            System.out.println("Me not found in user!");
        }

        //Printing blank line
        System.out.println();

        //Print out Part 2
        System.out.println("**************** PART 2 ***************");

        //Printing blank line
        System.out.println();

        //Creating a string named fun and assigning its value
        String fun = "A1B2C3D4";

        //Printing blank line
        System.out.println();

        //For loop iterating through each character in the string fun
        for (int i=0; i<8; i++){

            //If statement to check if the character is digit
            if (Character.isDigit(fun.charAt(i))){
                System.out.println("A digit found: " + fun.charAt(i));
            }
        }

    }
}

