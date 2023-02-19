/*
 * Project: Project 5
 * Description: Conversions in String
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class Convert {

    //Start of main method
    public static void main(String[] args){

        //Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Declaration of variables
        String userInput;
        int a;

        //while loop to continue the process and terminate only when user enters "q" or "Q"
        while (true) {

            //Message for user
            System.out.println("Please enter [q] or [Q] to terminate the program!");

            //Prompt user to enter the string
            System.out.print("Original string (input): ");
            userInput = input.nextLine();
            System.out.println();

            //If user enters q or Q then terminate the program
            if (userInput.equals("q") || userInput.equals("Q")){
                break;
            }

            //Converted string initiation
            System.out.print("Converted string (output): ");

            //Converting character to an array
            char[] ch = userInput.toCharArray();

            //For loop to iterate through the entire array
            for (int i = 0; i < userInput.length(); i++) {

                //If statement to check if the character is digit or not
                if (Character.isDigit(ch[i])){
                    //Storing it into integer a and double its value
                    a = ch[i] - '0';
                    a = 2 * a;

                    //If it is less than 10 then assign the same value to character array
                    if (a<10){
                        ch[i] = (char) (a+48);
                    }
                    //Else add the all the digits in the number and assign its value to character
                    else {
                        a = (a/10) + (a%10);
                        ch[i] = (char) (a+48);

                        //Other method
                        // a = a - 9
                    }

                    //method 2
                    // a = ch[i] * 2 - 48;
                }
                //If the character is upper case
                if (Character.isUpperCase(ch[i])){
                    //Convert it to lower case
                    ch[i] = Character.toLowerCase(ch[i]);
                }
                //if it is lower case
                else if (Character.isLowerCase(ch[i])){
                    //Convert it to upper case
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }
            //Print out the converted string
            System.out.println(ch);
            System.out.println();
        }
    }
    //End of main method
}
