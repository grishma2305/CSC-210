/*
 * Assignment: Midterm Makeup Assignment
 * Description: question 2
 * Name: Grishma Maheshbhai Thumar
 * ID: 922955012
 * Class: CSC 210
 * Semester: Fall 2022
 */

public class MidtermMakeup2 {

    //Start of main method
    public static void main(String[] args){

        //Declaration and call universe42 method
        int[] arr = {1, 4, 2, 1, 4, 2};
        System.out.println("Result of universe42 method is: " + universe42(arr));

    }
    //End of main method

    //Start of universe42 method
    public static boolean universe42(int[] array2){

        //For loop to iterate through the whole array
        for (int i = 0; i < array2.length; i++){

            //To check if 2 is next to a 4 also to make sure that 2 is not at index 0
            if (array2[i] == 2 && i > 0 && array2[i-1] == 4){
                return true;
            }
        }
        //Return false if the above condition is not true
        return false;
    }
    //End of universe42 method
}
