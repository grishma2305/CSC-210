/*Lab: Pre-Lab 3
 *Program: Compute Tax
 *Name: Thumar Grishma Maheshbhai
 * Student ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        // Creating a Scanner
        Scanner input = new Scanner(System.in);

        // Asking the user to enter filing status as we have used scanner before
        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");

        int status = input.nextInt();

        // Asking the user to enter taxable income with the help of scanner
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Computing the tax
        double tax = 0;

        if (status == 0) { // Computing tax for single filers using nested else if
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                         (income - 171550) * 0.33;
            else
                 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                         (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 1) { // Try it as an exercise using else if condition
            // Computing tax for married file who live together or qualifying widow
        }
        else if (status == 2) { // Try it as an exercise using else if condition
            // Computing tax for married file who are separated
        }
        else if (status == 3) { // Try it as an exercise using else if condition
            // Computing tax for the head of household
        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // Print statement to display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
 }
 