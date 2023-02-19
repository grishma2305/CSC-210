import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int userNumber, sum = 0;

        do {
            System.out.print("Enter a whole number (enter 0 to stop): ");
            userNumber = inputObj.nextInt();

            sum+=userNumber;

        } while(userNumber!=0);

//        while loop
//        System.out.print("Enter a whole number (enter 0 to stop): ");
//        userNumber = inputObj.nextInt();
//
//        while (userNumber!=0){
//            sum+=userNumber;
//
//            System.out.print("Enter a whole number (enter 0 to stop): ");
//            userNumber = inputObj.nextInt();
//        }

        System.out.println("The sum is " + sum);
    }
}
