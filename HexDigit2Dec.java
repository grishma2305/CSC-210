/*
 * Lab: Pre-Lab 4
 * Description: HexDigit2Dec
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class HexDigit2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        //If statement to check if the string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        //Exhibit the decimal value of the hex digit
        char ch = hexString.charAt(0);

        //If statement to check whether the character is f and a
        if (ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit "
                    + ch + " is " + value);
        }
        //Else if statement to check if the character is a digit
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit "
                    + ch + " is " + ch);
        }
        //Everything else will go here such as if the input is invalid
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
