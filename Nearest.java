public class Nearest {

    //Start of main method
    public static void main(String[] args){

        //Call and print nearest8 method
        System.out.println("Result is " + nearest8(5,10));
    }

    //Start of nearest8 method
    public static int nearest8(int a, int b){

        //If they go over 8 then return 0
        if (a>8 && b>8){
            return 0;
        }
        //Else if to check whether any value is over 8 and return accordingly which is near
        else if (a>8) {
            return b;
        } else if (b>8) {
            return a;
        }
/*
* else if(a>b){
*   return a;
* }
* else{
*   return b;
* }
* */
        //Declaration of variables to check which is near 8
        int varA = 8-a;
        int varB = 8-b;

        //If else to return the correct output
        if (varB<varA){
            return b;
        }
        else {
            return a;
        }
    }
}
