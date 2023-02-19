public class Party {

    //Start of main method
    public static void main(String[] args){

        //Call and print the outcome method
        System.out.println("Outcome is " + outcome(3,8));

    }

    //Start of outcome method
    public static String outcome(int tea, int candy){

        //If statements to decide the outcome of the party
        if (tea<4 || candy<4){
            return "bad";
        }
        if (tea>15 || candy>15) {
            return "great";
        }
        if (tea>=8 && candy>=8) {
            return "good";
        }

        //Return a value if nothing matches
        return "not matched";
    }
}
