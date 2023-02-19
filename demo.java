import java.util.Scanner;

public class demo {



        /**
         * In this program we are going to find the factorial
         * of a user entered number.
         * A factorial is a multiplication of all numbers less than
         * or equal to that number.
         * factorial of x = x * (x-1) * (x-2) * (x-3) * ... *2 * 1
         *
         * For example, factorial of 4 = 4 * 3 * 2 * 1 = 24
         * */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // First we need to create two variables
            // First will store the user entered number whose factorial we will count
            // Second will store the computed factorial value
            int userInput;
            int factorial=1;



            // Now prompt the user to enter a number
            // Remember to include the necessary library
            // and the object required to read from the keyboard
            System.out.println("Enter the number to find it's factorial");
            userInput = input.nextInt();



            // Think what loop could you use in this case (while, do-while, for)
            // How would you start?
            // What would the loop body have?
            // Ensure that you are storing the calculated values in the right variables
            // Once you come out of the loop, you should have the final factorial value
            for (int i=1; i<=userInput; i++){
                factorial = factorial*i;
                //System.out.println(factorial);
            }
            System.out.println("Factorial is " + factorial);
            // Print out the factorial value outside the loop


            // Create the necessary variables
            int no1, no2, oddnumber;

            // Prompt the user to enter the two numbers
            // smaller number first and larger number second
            System.out.println("Enter smaller number: ");
            no1 = input.nextInt();
            System.out.println("Enter larger number: ");
            no2 = input.nextInt();

            for (int i=no1; i<no2; i++ ){
                if(i%2!=0){
                    System.out.println(i);
                }
            }


            // Write a loop that will go from the smaller number to the larger number
            // printing out all the odd numbers in between



        }


}
