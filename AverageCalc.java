/*
 * Assignment: Project 1
 * Decription: Average Calculator
 * Name: Thumar Grishma Maheshbhai
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class AverageCalc{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);  //Creating a scanner object

        System.out.println("You need to enter three whole numbers in order to calculate it's average.");

        System.out.println("Enter the first number:"); //Asking to enter number 1
        double no1 = input.nextDouble();  //Declaring and storing the input of first number

        System.out.println("Enter the second number:"); //Asking to enter number 2
        double no2 = input.nextDouble(); //Declaring and storing the input of second number

        System.out.println("Enter the third number:"); //Asking to enter number 3
        double no3 = input.nextDouble();  //Declaring and storing the input of third number

        System.out.println("The numbers are " + no1 + " " + no2 + " " + no3);

        double avg = (no1+no2+no3)/3; //Declaration, assignment and computation of average

        System.out.println("The average of three number is " + avg); //Printing the average
    }
}
