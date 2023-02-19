/*
 * Project: Project 4
 * Description: Make your own restaurant and prompt clients to order
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class Order {

    //Start of main method
    public static void main(String[] args) {

        //Creating a scanner object
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Welcome to Eateries!!");

        //Declaration of variables
        int userChoice = 1;
        int price = 0;

        //Start of while loop
        while (userChoice != 0) {

            System.out.println();

            //Calling the display menu method
            displayMenu();

            //Prompt user to select an option
            System.out.print("Please choose one option at one time using the number (0 to end the order): ");
            userChoice = inputObj.nextInt();

            System.out.println();

            //If-else-if to check the user input and call the menu received method
            if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                price = menu_received(userChoice, price);
            }
            else if (userChoice != 0) {
                System.out.println("Invalid input. Try again!");
            }
        }

        //Print out the total by calling tip calculator method
        System.out.printf("Your total after tax and tip is $ %.2f", tip_calculator(price));
        System.out.println("\n");
        System.out.println("Thank you and enjoy the food and come again!");
    }
    //End of the main method

    //Start of display menu method
    public static void displayMenu(){

        //Print out the menu
        System.out.println("Here is our menu:");
        System.out.println("1. Bulgogi -- $15.00");
        System.out.println("2. Kalbi -- $18.00");
        System.out.println("3. Kimchi Fried Rice -- $16.00");

    }
    //End of the display menu method

    //Start of the menu received method
    public static int menu_received(int choice, int price){

        //Nested if-else to check the user input and increase price accordingly
        if (choice == 1) {
            System.out.println("Thank you for ordering Bulgogi");
            price += 15;
            System.out.println("Your total is $" + price);
        }
        else if(choice == 2) {
            System.out.println("Thank you for ordering Kalbi");
            price += 18;
            System.out.println("Your total is $" + price);
        }
        else if(choice == 3) {
            System.out.println("Thank you for ordering Kimchi Fried Rice");
            price += 16;
            System.out.println("Your total is $" + price);
        }
        //Return the price
        return price;
    }
    //End of menu received method

    //Start of tip calculator method
    public static double tip_calculator(int total){

        Scanner inputObj = new Scanner(System.in);

        //calculating price after tax
        double newPrice = total + (total * 7.25) / 100;

        System.out.printf("Your total after tax is $%.2f", newPrice);

        System.out.println("\n");

        //PRint out the tips and prompt user to enter their choice
        System.out.print("1. tip 10%: ");
        System.out.printf("%.2f", (newPrice * 10) / 100);
        System.out.println();
        System.out.print("2. tip 15%: ");
        System.out.printf("%.2f", (newPrice * 15) / 100);
        System.out.println();
        System.out.print("3. tip 20%: ");
        System.out.printf("%.2f", (newPrice * 20) / 100);
        System.out.println();
        System.out.print("Please choose one option: (0 for no tip): ");
        int tip = inputObj.nextInt();
        System.out.println();

        //Nested if-else to add the tip to the price
        if (tip == 1){
            return newPrice += (newPrice * 10) / 100;
        } else if (tip == 2) {
            return newPrice += (newPrice * 15) / 100;
        } else if (tip == 3) {
            return newPrice += (newPrice * 20) / 100;
        } else if (tip == 0) {
            return newPrice;
        } else {
            System.out.println("Invalid input!!");
        }

        //Return the final price
        return newPrice;
    }
    //End of tip calculator method

}

