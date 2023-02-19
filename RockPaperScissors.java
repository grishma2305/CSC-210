/*
 * Assignment: Debugging Practice(Extra Credit)
 * Description: Debugging in Rock, Paper, Scissors Program
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

public class RockPaperScissors {

        public static void main(String[] args) {
            String choice1 = "rock";
            //String choice2 = "rock";
            //String choice2 = "scissors";
            String choice2 = "paper";


            String result = "no result";

            System.out.println("choices:" + choice1 + "," + choice2);

            if (choice1 == choice2)
                result = "The result is a tie!";
            else {
                if (choice1 == "rock") {
                    if (choice2 == "scissors")
                        result = "rock wins";
                    else // choice2 must be paper
                        result = "paper wins";
                }
                if (choice1 == "paper") {
                    if (choice2 == "rock")
                        result = "paper wins";
                    else  // choice2 must be scissors
                        result = "scissors wins";
                }
                if (choice1 == "scissors") {
                    if (choice2 == "rock")
                        result = "rock wins";
                    else // choice2 must be paper
                        result = "scissors wins";
                }
                }
            System.out.println("result:" + result);
        }

}
