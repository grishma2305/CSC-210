public class FinalQue9 {

    public static boolean only58(int[] numbers){

        //For loop to iterate through the entire array
        for (int i = 0; i < numbers.length; i++){
            //If to check the number is not 5 nor 8
            if (numbers[i] != 5 && numbers[i] != 8){
                //Return false if all numbers are not 5 and 8
                return false;
            }
        }
        //Otherwise return true
        return true;
    }

    //Main to check implication
    public static void main(String[] args){
        int[] no = {3, 1, 2, 6};
        System.out.println(only58(no));
    }
}
