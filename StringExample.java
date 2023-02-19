import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        String myString = "HelLo WoRLd";
        String newString;

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter 1 to convert to lower case " + "enter 2 to convert to upper case:");
        int userChoice = inputObj.nextInt();

        if (userChoice == 1){
            newString = myString.toLowerCase();
        } else if (userChoice == 2) {
            newString = myString.toUpperCase();
        } else {
            newString = "*** WRONG INPUT ***";
        }
        System.out.println("The converted text is: " + newString);
    }
}
