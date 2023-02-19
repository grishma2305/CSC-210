/*
 * Pre-Lab: 5
 * Description: Greatest Common Divisor
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class GreatestCommonDivisor {
    /** Main method */
    public static void main(String[] args) {
        // Creating a Scanner Object
        Scanner input = new Scanner(System.in);

         // Asking the user to enter the first and second integer to find it's gcd
         System.out.print("Enter first integer: ");
         int n1 = input.nextInt();
         System.out.print("Enter second integer: ");
         int n2 = input.nextInt();

         int gcd = 1; // Declaring the initial gcd value which is 1
         int k = 2; // This would the possible value of gcd
         while (k <= n1 && k <= n2) {
             if (n1 % k == 0 && n2 % k == 0)
                 gcd = k; // Now it would be the updated value of gcd
             k++;
         }

         System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
 }
