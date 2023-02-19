/*
 * Assignment: 6
 * Description: Performing various functions using different methods
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class Assignment6 {

        public static void main(String[] args) {

            //First method to calculate the exponent value, and return the exponent using math function
            double calculatedExponent = exponentCalculator();
            System.out.println(calculatedExponent); //this should print out the exponent value

            //Second method to return the char at position of the string using two parameters
            //If num greater than the length then print an error message
            char charFound = charAtPosition("This is a random string", 5);
            System.out.println(charFound); //to help you test: this should print out 'i'.

            //Third method to check if string has digit and return if it does
            boolean numberFound = hasNumber("CSC210");
            System.out.println(numberFound);
        }

         //Starting of exponentCalculator method
         public static double exponentCalculator() {

            //Creating a Scanner object
            Scanner inputObj = new Scanner(System.in);

            //Prompt user to enter base
            System.out.print("Enter the first value which will be the base: ");
            int base = inputObj.nextInt();

             //Prompt user to enter exponent
            System.out.print("Enter the second value which will be the power: ");
            int exponent = inputObj.nextInt();

            //Return value using mathematical function
            return Math.pow(base, exponent);

        }

         //Starting of charAtPosition method
         public static char charAtPosition(String this_is_a_random_string, int i) {

            //If statement to check whether the int value is greater than i
            if (i>this_is_a_random_string.length()){
                System.out.println("This is an invalid number!");
            }

            //Return value
            return this_is_a_random_string.charAt(i);
        }

         //Starting of hasNumber method
         public static boolean hasNumber(String csc210) {

            //For loop to iterate through the whole string
            for (int i=0; i<=csc210.length(); i++){

                //if to check whether the string has digit and if yes then return true
                if (Character.isDigit(csc210.charAt(i))){
                    return true;
                }
            }

            //String does not have digit then return false
            return false;
        }
}
