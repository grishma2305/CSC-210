/*
 * Assignment: Project 1
 * Decription: Knock Knock Joke
 * Name: Thumar Grishma Maheshbhai
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);     //Creating a scanner object

        System.out.println("Knock Knock!");//Printing the starting statement of joke

        String whoque = input.nextLine();           //Prompt question from user

        System.out.println("Nun");                  //Printinng the name

        String nameque = input.nextLine();          //Prompt user to ask question based on name

        System.out.println("Nun of your business!!");//Replying to the asked question

        sum(5, 20);
        System.out.println(sum(5, 10));

        int[] s = {3, 5, 6, 2 , 2};
        System.out.println("Your implementation of sum8 method printed out: " + arr1(s));

        int[] array1 = {2,5,3,4,7,8,10};
        System.out.println(Arrays.toString(evenOdd(array1)));

        String bob = "Bob";
        System.out.println(name(bob));

    }

    public static String name(String bob){
        bob = "Bob";
        return ("Hello " + bob + "!");
    }

    public static int[] evenOdd(int[] array1){
        int countEven = 0;
        int countOdd = array1.length-1;
        int[] newArray = new int[array1.length];
        for (int i=0; i< array1.length; i++){
            if (array1[i]%2 == 0){
                newArray[countEven] = array1[i];
                countEven++;
            }
            else {
                newArray[countOdd] = array1[i];
                countOdd--;
            }
        }
        return newArray;
    }

    public static boolean arr1(int[] s) {
        for (int i=0; i<s.length; i++){
            if (s[i]==2&&s[i+1]==2 ){
                return true;
            }
        }
        return false;
    }


    public static int sum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19){
            return 20;
        }
        return sum;
    }

}
