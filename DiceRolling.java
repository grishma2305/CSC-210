/*
 * Project: Project 2
 * Description: DiceRolling and check number is odd or even and is divisible by 3 or not
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

public class DiceRolling {

    //Declaration of main method
    public static void main(String[] args) {

        //Declaration and assignment of variables
        int min = 1;
        int max = 6;

        //Computation of range and dice roll
        int range = max - min + 1;
        int diceRoll = (int) (Math.random() * range) + 1;

        System.out.println("I got " + diceRoll + ".");

        //If else statement to check if the number is odd or even
        if(diceRoll%2==0){
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }

        //If else statement to check if the number is divisible by 3 or not
        if(diceRoll%3==0){
            System.out.println("This is divisible by 3.");
        }
        else {
            System.out.println("This is not divisible by 3.");
        }
    }
}
