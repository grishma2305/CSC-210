
/*
* Lab: Chapter 2 Lab
* Program: BMI Calculator
* Name: Thumar Grishma Maheshbhai
* Student id: 922950012
* Class: CSC 211-06
* Semester: Fall 2022
* */

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);  //Creating a scanner object

        System.out.println("Welcome to my BMI caculator!");

        System.out.println("Input your weight in kilogram"); //Asking question to enter weight
        int weight = input.nextInt(); //Declaring and storing the user input of weight variable

        System.out.println("Input your height in metres"); //Asking question to enter height
        double height = input.nextDouble(); //Declaring and storing the user input of height variable

        System.out.println("Your weight is : " + weight + " kg"); //Print out the weight entered by user
        System.out.println("Your height is : " + height + " m");  //Print out the height entered by user

        double Bmi = weight / (height * height); //Declaring and assigning value to BMI

        System.out.println("Your BMI is : " + Bmi + " kg/m2"); //Print out BMI

        System.out.println("_________________________________________________________________________________________");

        int castedBmi = (int)(Bmi);

        System.out.println("Your BMI casted into an integer is : " + castedBmi + "kg/m2"); //Print Out BMI in int
    }
}
