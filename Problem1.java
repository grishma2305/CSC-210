/*Name: Thumar Grishma Maheshbhai
 *Student: 922950012
 *Assignment 2: Calculating Area and Perimeter
 *Class: CSC 210-01
 *Semester: Fall 2022
*/

import java.util.Scanner;

public class Problem1 {
        /**
         * In this program, we are going to calculate the area and perimeter of a rectangle.
         * The formulas are:
         * area = length * width
         * perimeter = 2 * (length + width)
         * There are comments below to guide you to write the program step-by-step. Write your code immediately below
         * each comment
         */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);  //Creating a scanner object

            System.out.println("Enter the length in meter"); //Asking question to enter length
            double length = input.nextDouble(); //Declaring and storing the user input of length variable

            System.out.println("Enter the width in meter"); //Asking question to enter weight
            double width = input.nextDouble(); //Declaring and storing the user input of width variable

            // Declaring variables to store the area and perimeter once the values are computed.
            double area, perimeter;

            // Computing the area with the assigned values
            area = length * width;

            // Computing the perimeter with the assigned values
            perimeter = 2 * (length + width);

            // Printing out the assigned values as well as it's computation(that is area and perimeter)
            System.out.println("The area of length " + length + " m and width " + width + " m is: " + area + " m2.");
            System.out.println("The perimeter of length " + length + " m and width " + width + " m is: " + perimeter + " m.");
        }
    }
