/*
 * Project: Project 4
 * Description: Allow user to perform various bank operations
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class BankAccount {

    //Start of main method
    public static void main(String[] args){

        //Creating scanner object
        Scanner input = new Scanner(System.in);

        //Declaration of variables
        int givenAccountNo = 123456;
        double givenBalance = 0;
        String givenAnswer = "SF";

        int userChoice = 1;

        //Ask a security question from user and if it is correct then allow to perform the operations
        System.out.println("To access the Bank operations answer it!!");
        System.out.print("In which city was your first job? ");
        String userAnswer = input.nextLine();

        if (userAnswer.equals(givenAnswer)) {

            //Start of while loop
            while (userChoice != 0) {

                //Print out the bank operations
                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Change answer of security question");
                System.out.println("5. Exit");

                //Prompt user to enter their choice
                System.out.print("Enter your choice: ");
                userChoice = input.nextInt();
                System.out.println();

                //Switch case to call the method
                switch (userChoice) {

                    case 1:
                        //Call the check balance method
                        checkBalance(givenBalance, givenAnswer, givenAccountNo);
                        break;

                    case 2:
                        //Call the deposit money method
                        givenBalance = depositMoney(givenBalance);
                        break;

                    case 3:
                        //Call the withdrawn money method
                        givenBalance = withdrawMoney(givenBalance);
                        break;

                    case 4:
                        //Call the change answer security question method
                        givenAnswer = changeAnsSecurityQuestion();
                        break;

                    case 5:
                        //To terminate the loop
                        System.out.println("Thank you for visiting us!");
                        return;

                    default:
                        System.out.println("Enter a valid choice");
                }

            }
        }
        else {
            System.out.println("Your answer is incorrect!!");
        }

    }
    //End of the main method

    //Start of the check balance method
    public static void checkBalance(double balance, String answer, int accountNo){

        Scanner input = new Scanner(System.in);

        //Prompt user to enter the ans of security question
        System.out.print("In which city was your first job? ");
        String userAnswer = input.nextLine();

        System.out.println("Account Number: " + accountNo);

        //If ans is correct then display the balance
        if (answer.equals(userAnswer)){
            System.out.println("Balance: $" + balance);
        }
        else {
            System.out.println("Incorrect answer!!");
        }
    }
    //End of the check balance method

    //Start of the deposit money method
    public static double depositMoney(double balance){

        Scanner input = new Scanner(System.in);
        double deposit = 0;

        //Prompt user to enter amount to deposit
        System.out.print("Enter the amount to deposit: ");
        deposit = input.nextInt();

        //Adding it to the balancr
        balance += deposit;

        //Return the balance
        return balance;
    }
    //End of the deposit money method

    //Start of the withdrawn money method
    public static double withdrawMoney(double balance){

        Scanner input = new Scanner(System.in);

        double withdraw = 0;
        //Prompt user to enter the amount to withdraw
        System.out.print("Enter the amount to withdraw: ");
        withdraw = input.nextInt();

        //If else to check if the amount is less than the current balance
        if (balance >= withdraw){
            balance -= withdraw;
        }
        else {
            System.out.println("Transaction failed. Not enough balance!");
        }
        //Return balance
        return balance;
    }
    //End of the withdrawn money method

    //Start of the change answer security question method
    public static String changeAnsSecurityQuestion(){

        Scanner input = new Scanner(System.in);

        //Prompt user to enter the mew answer
        System.out.print("In what city was your first job? ");
        String answer = input.nextLine();

        //Return the new answer
        return answer;
    }
    //End of the change answer security question method
}
