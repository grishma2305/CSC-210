/*
 * Assignment: 3b
 * Decription: Printing number of days in any given year and month
 * Name: Thumar Grishma Maheshbhai
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */
import java.util.Scanner;

public class Calendar {

    public static void main(String [] args) {

        //variable to store number of days in month
        int daysInMonth = 0;
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the year and store it in a variable
        System.out.println("Enter the year:");
        int year = input.nextInt();

        // Prompt user to enter the month number and store it in a variable
        System.out.println("Enter the month:");
        int month = input.nextInt();

        //Switch to print different days in a month
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;

            case 2:
                //If else statement for february month in order to calculate days based on leap year
                if ( ((year % 4 ==0) && (year % 100 !=0)) || (year % 400 ==0) ){
                    daysInMonth = 29;
                }
                else{
                    daysInMonth = 28;
                }

        }

        // Print out the detail stating the number of days in the year and the month that the user had entered
        System.out.println("The number of days in the year " + year + " and the month " + month+ " is " + daysInMonth + ".");

    }

}
