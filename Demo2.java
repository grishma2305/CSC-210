public class Demo2 {
    public static void main(String[] args) {

        int min = 1;
        int max = 6;
        int range = max - min + 1;
        int diceRoll = (int) (Math.random() * range) + 1;

        System.out.println("I got " + diceRoll);
        if(diceRoll%2==0){
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }

        if(diceRoll%3==0){
            System.out.println("It is divisble by 3");
        }
        else {
            System.out.println("It is not divisble by 3");
        }
    }
}
