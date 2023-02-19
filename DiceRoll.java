
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

        // Write your logic below



    }

}
