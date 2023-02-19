/*
* Pre-Lab: 6
* Description: Greatest Common Divisor Method
* Name: Grishma Maheshbhai Thumar
* Student id: 922950012
* Class: CSC 211-06
* Semester: Fall 2022
* */

import java.util.Scanner;

public class GreatestCommonDivisorMethod {

        /** Creating a Main Method **/
        public static void main(String[] args) {

            // Creating a Scanner Object
            Scanner input = new Scanner(System.in);

             // Asking the user to enter the value of two integers
             System.out.print("Enter first integer: ");
             int n1 = input.nextInt();
             System.out.print("Enter second integer: ");
             int n2 = input.nextInt();
                System.out.println("The greatest common divisor for " + n1 +
                         " and " + n2 + " is " + gcd(n1, n2));
        }

         /** Returning the value of gcd of the declared two integers*/
         public static int gcd(int n1, int n2) {
         int gcd = 1; // Declaration and assignment of initial gcd which is 1
         int k = 2; // Value of the possible gcd

         while (k <= n1 && k <= n2) {
             if (n1 % k == 0 && n2 % k == 0)
                 gcd = k; // It would be the updated value of gcd
             k++;
             }

         return gcd; // Returning the value of gcd
         }
 }
