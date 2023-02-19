/*
 * Assignment: Midterm Makeup Assignment
 * Description: question 1
 * Name: Grishma Maheshbhai Thumar
 * ID: 922955012
 * Class: CSC 210
 * Semester: Fall 2022
 */

public class MidtermMakeup1 {

    //Start of main method
    public static void main(String[] args){

        //Declaration and call isArrayFull method
        int[] array = {1, 0, 4, 5, 6};
        System.out.println("Result of isArrayFull method is: " + isArrayFull(array));

    }
    //End of main method

    //Start of isArrayFull method
    public static boolean isArrayFull(int[] array1){

        //For loop to iterate through the whole array
        for (int i = 0; i < array1.length; i++){

            //If statement to check if the array has empty slots and return false
            if (array1[i] == 0){
                return false;
            }
        }
        //Return true if the above condition is not true
        return true;
    }
    //End of isArrayFull method
}
