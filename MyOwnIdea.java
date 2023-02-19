/*
 * Assignment: Project 1
 * Decription: In MyOwnIdea I have created a Shopping Cart
 * Name: Thumar Grishma Maheshbhai
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class MyOwnIdea {
    public static void main(String[] args){

        //Creating a Scanner Object
        Scanner input = new Scanner(System.in);

        //Declaration of variables which will be used further
        int price1=30, price2=25, price3=20;

        //Welcoming Statement
        System.out.println("Welcome to your Shopping Cart!!");

        //Blank Line
        System.out.println("");

        //Ask to select gender
        System.out.println("Male = 1");
        System.out.println("Female = 2");
        System.out.println("Kids = 3");
        System.out.println("Enter Gender you want to shop for::");
        //Declaring gender variable in order to store the selected value
        int gender = input.nextInt();

        //If else statement for gender category

        //Male nested if else
        if(gender==1){
            System.out.println("You selected male");
            System.out.println("");
            System.out.println("Formal Pair=1");
            System.out.println("Informal Pair=2");
            System.out.println("Select your category::");
            int category = input.nextInt();

            //Switch case in order to select category and make payment
            switch(category){
                case 1:
                    System.out.println("Formal Pair Price = $" + price1);
                    System.out.println("");
                    System.out.println("Enter your payment:");
                    int formalpay = input.nextInt();
                    if(formalpay==price1){
                        System.out.println("Successfull!!");
                    }
                    else{
                        System.out.println("Enter the correct amount.");
                    }
                break;

                case 2:
                    System.out.println("Informal Pair Price = $" + price2);
                    System.out.println("");
                    System.out.println("Enter your payment");
                    int informalpay = input.nextInt();
                    if(informalpay==price2){
                        System.out.println("Successfull!!");
                    }
                    else{
                        System.out.println("Enter the correct amount.");
                    }
                break;

                default:
                    System.out.println("Please select the valid category");
            }
        }

        //Female using nested if else
        else if(gender==2){
            System.out.println("You selected female");
            System.out.println("");
            System.out.println("Formal Pair=1");
            System.out.println("Informal Pair=2");
            System.out.println("Traditional=3");
            System.out.println("Select your category::");
            int category = input.nextInt();

            //Switch case in order to select category and make payment
            switch (category){
                case 1:
                System.out.println("Formal Pair Price = $" + price1);
                System.out.println("");
                System.out.println("Enter your payment:");
                int formalpay = input.nextInt();
                if(formalpay==price1){
                    System.out.println("Successfull!!");
                }
                else{
                    System.out.println("Enter the correct amount.");
                }
                break;

                case 2:
                System.out.println("Informal Pair Price = $" + price2);
                System.out.println("");
                System.out.println("Enter your payment");
                int informalpay = input.nextInt();
                if(informalpay==price2){
                    System.out.println("Successfull!!");
                }
                else{
                    System.out.println("Enter the correct amount.");
                }
                break;

                case 3:
                System.out.println("Traditional Pair Price = $" + price3);
                System.out.println("");
                System.out.println("Enter your payment");
                int traditionalpay = input.nextInt();
                if(traditionalpay==price3){
                    System.out.println("Successfull!!");
                }
                else{
                    System.out.println("Enter the correct amount.");
                }
                break;

                default:
                System.out.println("Please select the valid category");
            }
        }

        //Kids using nested if else
        else if(gender==3) {
            System.out.println("You selected kids");
            System.out.println("");
            System.out.println("Formal Pair=1");
            System.out.println("Informal Pair=2");
            System.out.println("Select your category::");
            int category = input.nextInt();

            //Switch case in order to select category and make payment
            switch (category) {
                case 1:
                    System.out.println("Formal Pair Price = $" + price1);
                    System.out.println("");
                    System.out.println("Enter your payment:");
                    int formalpay = input.nextInt();
                    if (formalpay == price1) {
                        System.out.println("Successfull!!");
                    } else {
                        System.out.println("Enter the correct amount.");
                    }
                    break;

                case 2:
                    System.out.println("Informal Pair Price = $" + price2);
                    System.out.println("");
                    System.out.println("Enter your payment");
                    int informalpay = input.nextInt();
                    if (informalpay == price2) {
                        System.out.println("Successfull!!");
                    } else {
                        System.out.println("Enter the correct amount.");
                    }
                    break;
                default:
                    System.out.println("Please select the valid category");
            }
        }
        //If the gender entered does not matches
        else{
            System.out.println("Invalid value");
        }
    }
}
