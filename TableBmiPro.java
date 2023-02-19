/*
 * Project: Project 3
 * Description: Create a BMI calculator table
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class TableBmiPro {

    //Create main method
    public static void main(String[] args){

        //Printing welcoming statements
        System .out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^ Welcome to:\n^\tBODY MASS INDEX (BMI) Computation PRO\n^\t\tby GRISHMA MAHESHBHAI THUMAR\n^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        //Calling bmiTable method to get userInput and print the table
        bmiTable();

        //Ending the program with a thanking you statement
        System.out.println();
        System .out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^\tThank you for using my program.");
        System .out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

    }

    public static void bmiTable() {

        //Create a Scanner Object
        Scanner inputObj = new Scanner(System.in);

        //Declaring string variable named condition
        String condition;

        //Prompt user to enter height in feet and inches
        System.out.print("Enter height in feet and inches: ");
        int heightInFeet = inputObj.nextInt();
        int heightInInches = inputObj.nextInt();

        //Prompt user to enter their lowest weight
        System.out.print("Enter the low weight in pounds: ");
        int lowWeight = inputObj.nextInt();

        //Prompt user to enter their highest weight
        System.out.print("Enter the high weight in pounds: ");
        int highWeight = inputObj.nextInt();

        //Printing the table heading
        System.out.println("Weight\t\tBMI\t\t\t\tCondition");

        //For loop to iterate from low weight to high weight at an increment of 5
        for (int i=lowWeight; i<highWeight; i+=5){

            //Declaring and assigning the value of bmi
            float bmi = (float) (i  * 703 / Math.pow(heightInInches,2) );

            //If statement to check whether the bmi is greater than 25 or not and accordingly assign value to condition
            if (bmi > 25){
                condition = "overweight";
            }
            else {
                condition = "not overweight";
            }

            //Printing the value of weight, bmi and condition
            System.out.printf(i + "\t\t\t" + "%.4f" + "\t\t\t" + condition, bmi);
            System.out.println();

        }

    }
}
