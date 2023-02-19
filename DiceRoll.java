/*Name: Thumar Grishma Maheshbhai
 *Student: 922950012
 *Assignment: 3a
 *Description: Implementing Dice Roll
 *Class: CSC 210-01
 *Semester: Fall 2022
 */


public class DiceRoll {

    /**
     * The program implements a dice roll with random value between 1 and 6.
     * The rolled value is stored in a variable called "diceRoll"
     * Use that variable to implement the following logic
     * if the diceRoll is 1 or 2: print "Low value"
     * if the diceRoll is 3 or 4: print "Medium value"
     * if the diceRoll is 5 or 6: print "High value"
     **/

    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        int range = max - min + 1;
        int diceRoll = (int) (Math.random() * range) + 1;

        //Logic based on if-else statement
        if(diceRoll<=2){
            System.out.println("Low Value");
        }
        else if(diceRoll<=4){
            System.out.println("Medium Value");
        }
        else if(diceRoll <=6){
            System.out.println("High Value");
        }
    }
}
