/*
 * Lab: 3
 * Description: GPA Calculator
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

import java.util.Scanner; //Scanner Class is used to get the input of the user

public class GpaCalculator {
    public static void main(String[] args){

        //Creating a Scanner object
        Scanner input = new Scanner(System.in);   //Creating a Scanner object

        System.out.println("Please enter your percentage:");

        //Variable to store the percentage entered by the user
        double percentage = input.nextDouble();

        //Variable to store the grade
        String grade = "";

        //Variable to store the gpa
        Double gpa;

        //If statements to provide the correct grade and gpa
        if(percentage>=97){
            grade = "A+";
            gpa = 4.0;
        } else if (percentage>=93) {
            grade = "A";
            gpa = 4.0;
        } else if (percentage>=90) {
            grade = "A-";
            gpa = 3.7;
        } else if (percentage>=87) {
            grade = "B+";
            gpa = 3.3;
        } else if (percentage>=83) {
            grade = "B";
            gpa = 3.0;
        } else if (percentage>=80) {
            grade = "B-";
            gpa = 2.7;
        } else if (percentage>=77) {
            grade = "C+";
            gpa = 2.3;
        } else if (percentage>=70) {
            grade = "C";
            gpa = 2.0;
        } else if (percentage>=67) {
            grade = "D+";
            gpa = 1.7;
        } else if (percentage>=60) {
            grade = "D";
            gpa = 1.0;
        } else {
            grade = "F";
            gpa = 0.7;
        }

        //Printing the final result that is with the grade and gpa
        System.out.println("Your grade is " + grade);
        System.out.println("Your gpa is " + gpa);

    }
}
