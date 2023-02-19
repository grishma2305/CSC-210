import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        int ourNumber = (int) (Math.random() * 101);

        Scanner inputObj = new Scanner(System.in);


        int userGuess = -99;

        while (ourNumber != userGuess) {

            System.out.println("Guess the number: ");
            userGuess = inputObj.nextInt();

            if (userGuess < ourNumber) {
                System.out.println("Too Low");
            } else if (userGuess > ourNumber) {
                System.out.println("Too High");
            } else {
                System.out.println("Correct Choice!!");
            }

        }
    }
}
