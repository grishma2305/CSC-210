public class FinalQue10 {

    public static boolean canFormTriangle(double stick1, double stick2, double stick3){

        //Nested if-else to check the conditions and thereby return its value
        if (stick1 + stick2 <= stick3){
            return false;
        } else if (stick1 + stick3 <= stick2) {
            return false;
        } else if (stick2 + stick3 <= stick1) {
            return false;
        }
        else {
            return true;
        }
    }

    //Main to check implication
    public static void main(String[] args){
        System.out.println(canFormTriangle(2.2, 2.2, 2.2));
    }
}
