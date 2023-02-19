import java.util.Scanner;

public class Omni {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        int currentChannel = 0;
        int currentVolume = 20;
        String currentInputType = "Cable";

        int userChoice = 1;
        while(userChoice != 0){
            displayMainMenu();
            userChoice = inputObj.nextInt();

            if(userChoice == 1) {
                currentChannel = changeChannel(currentChannel);
                System.out.println("You are now in channel number: " + currentChannel);
            } else if(userChoice == 2) {
                currentVolume = changeVolume(currentVolume);
                System.out.println("The volume is now: " + currentVolume);
            } else if(userChoice == 3) {
                currentInputType = changeInput(currentInputType);
                System.out.println("Changing your input to: " + currentInputType);
            } else if (userChoice != 0){
                System.out.println("Invalid input. Try again!");
            }
        }
    }

    public static int changeChannel(int currentChannel) {
        Scanner inputObj = new Scanner(System.in);


        displayChannelMenu();

        int userChannelChoice = inputObj.nextInt();

        if (userChannelChoice == 1) {
            currentChannel++;
        } else if (userChannelChoice == 2) {
            currentChannel--;
        } else {
            currentChannel = userChannelChoice;
        }
        return currentChannel;

    }



    public static void displayChannelMenu() {
        System.out.println("*****Welcome to Samsung TV Channel menu*****");
        System.out.println("\t Enter 1 if you want to move the channel up");
        System.out.println("\t Enter 2 if you want to move the channel down");
        System.out.print("\t Enter any number to move it to that channel: ");
    }


    public static void displayVolumeMenu() {
        System.out.println("*****Welcome to Samsung TV Volume menu*****");
        System.out.println("\t Enter 1 if you want to increase the volume");
        System.out.println("\t Enter 2 if you want to decrease the volume");
    }



    public static int changeVolume(int currentVolume) {
        Scanner inputObj = new Scanner(System.in);

        String continuationChoice = "y";
        int userChoice = 0;

        while(continuationChoice.equals("y")) {
            displayVolumeMenu();
            userChoice = inputObj.nextInt();

            if (userChoice == 1) {
                currentVolume++;
            } else if (userChoice == 2) {
                currentVolume--;
            }

            System.out.println("Do you want to continue (y/n)");
            continuationChoice = inputObj.next();
        }
        return 0;
    }




    //TODO
    public static String changeInput(String currentInput) {
        return "HDMI-2";
    }

    public static void displayMainMenu(){
        System.out.println("*****Welcome to Samsung TV menu (Enter 0 to end this)*****");
        System.out.println("Enter 1 if you want to change channel");
        System.out.println("Enter 2 if you want to change volume");
        System.out.print("Enter 3 if you want to change input type: ");
    }
}