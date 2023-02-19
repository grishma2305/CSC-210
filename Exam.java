public class Exam {
    //Start of main method
    public static void main(String[] args){

        //Call and print sum method
        System.out.println("Double of sum of numbers is " + sum(-5));

    }

    //Start of sum method
    public static double sum(int x){
        //Declaration of sum to store sum of numbers
        int sum;
        //Assignment of sum using the formula to calculate sum of n numbers
        sum = x * (x+1)/2;

        //If number is less than 0 then assignment of sum and return it
        if (x<0){
            sum = x * (x-1) / 2;
            return -sum*2;
        }

        //Return the double of sum
        return sum*2;
    }
}
/*
* int sum =0;
* if(a<0){
*   for(int i=-1; i>=a; i--){
*       sum = sum + i;
*   }
* }
* else {
*   for(int i=0; i<=a; i++){
*       sum = sum + i;
*   }
* }
* return 2*sum;
* */
