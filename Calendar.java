import java.util.Scanner;
public class Calendar {

    public static void main(String [] args) {

        int daysInMonth = 0; // number of days in month
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the year and store it in a variable
        System.out.println("Enter the year:");
        int year = input.nextInt();


        // Prompt user to enter the month number and store it in a variable
        System.out.println("Enter the month:");
        int month = input.nextInt();



        // Create a switch to print different days in a month
        // Note: in your February case, you have to check if the year is a leap year.
        // For each case, update the appropriate variable (refer to the top of the main method to know the variable)
        switch (month){
            case 1;
            case 3;
            case 5;
            case 7;
            case 8;
            case 10;
            case 12;
                daysInMonth = 31;
                break;

            case 4;
            case 6;
            case 9;
            case 11;
                daysInMonth = 30;
                break;
        }

        if ( !( (year % 4 ==0) && (year % 100 !=0) || (year % 400 ==0) ) && (month==2) ){
            daysInMonth = 28;
        }
        else {
            daysInMonth = 29;
        }




        // Print out the detail stating the number  of days in the year and the month that the user had entered




    }
}
