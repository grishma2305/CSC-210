/*
 * Project: Project 3
 * Description: Rolling a dice and then calculating its probability
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class DiceRoll2 {

    public static void main(String[] args){

        //Calling the method rollDice to execute the program
        rollDice();
    }

    public static void rollDice() {

        //Creating a Scanner Object
        Scanner inputObj = new Scanner(System.in);

        //Declaration of variables
        int min = 1;
        int max = 6;
        int range = max - min + 1;
        int diceRoll = 0;
        double[] value = {0, 0, 0, 0, 0, 0};

        //Prompt user tp enter how many times they want to roll dice
        System.out.print("Enter the times you need to roll a dice: ");
        int nTimes = inputObj.nextInt();

        //If statement to check the range to number entered
        if (nTimes>0 && nTimes<1000000) {

            //For loop to roll dice n times and add the value
            for (int i = 0; i < nTimes; i++) {
                diceRoll = (int) (Math.random() * range) + 1;

                //If else statement to add the value of occurrence of each phase
                if (diceRoll == 1) {
                    value[0]++;
                } else if (diceRoll == 2) {
                    value[1]++;
                } else if (diceRoll == 3) {
                    value[2]++;
                } else if (diceRoll == 4) {
                    value[3]++;
                } else if (diceRoll == 5) {
                    value[4]++;
                } else if (diceRoll == 6) {
                    value[5]++;
                }
            }

            //Printing occurrence of each face
            System.out.println("\n[When the number of rolls is " + nTimes + "]");
            System.out.println("Occurrence of each face is: ");
            System.out.println(value[0] + ", " + value[1] + ", " + value[2] + ", " + value[3] + ", " + value[4] + ", " + value[5] + ": " + nTimes);

            //To print empty line
            System.out.println("\n");

            //Printing the probability
            System.out.println("Therefore, the probability of each face is:");
            System.out.printf("%.4f, %.4f, %.4f, %.4f, %.4f, %.4f.", value[0]/nTimes, value[1]/nTimes, value[2]/nTimes, value[3]/nTimes, value[4]/nTimes, value[5]/nTimes);

        }

        //else if the input is not within the range that is 1 to 1 million
        else {
            System.out.println("Invalid input!!");
        }

    }
}
