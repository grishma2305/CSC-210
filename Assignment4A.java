import java.util.Scanner

public class Assignment4A {

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
        int factorial;



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
        for (int i=0; i<userInput; i++){
            factorial = userInput * (userInput-1);
            System.out.println(factorial);
        }
        System.out.println("Factorial is");



        // Print out the factorial value outside the loop


    }
}
