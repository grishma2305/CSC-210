import java.util.Scanner;

public class FinalQue11 {
    public static void main(String[] args) {

        Scanner inputObj = new Scanner(System.in);



        System.out.print("Enter a numerator (integer): ");

        int numerator = inputObj.nextInt();


        System.out.print("Enter a denominator (integer): ");

        int denominator = inputObj.nextInt();


        // MODIFY THE CODE BELOW THIS TO HANDLE POTENTIAL EXCEPTION(S)

        //Try catch to handle the exception

        //Try to calculate the value
        try {
            int quotient = numerator / denominator;

            System.out.println("The quotient is " + quotient);

            System.out.println("Start 2");
            int[] arr = {1, 2, 3};
            System.out.println( arr[99] );

            System.out.println("statement 3");
        }
        //Catch to get the arithmetic exception as it occurs when denominator is 0
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("An exception was caught!");
        }
        catch (ArithmeticException ex2) {
            System.out.println("Denominator can not be 0");
        }
        finally {
            System.out.println("End of the program.");
        }
        System.out.println("Statement 7");


    }
}
