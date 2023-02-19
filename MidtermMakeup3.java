/*
 * Assignment: Midterm Makeup Assignment
 * Description: question 3
 * Name: Grishma Maheshbhai Thumar
 * ID: 922955012
 * Class: CSC 210
 * Semester: Fall 2022
 */

public class MidtermMakeup3 {

    //Start of main method
    public static void main(String[] args){

        //Declaration and call both242 method
        int[] arr3 = {2, 4, 2};
        System.out.println("Result of both242 method is: " + both242(arr3));
    }
    //End of main method

    //Start of both242 method
    public static boolean both242(int[] array3){

        //Declaration and assignment of variables to count the occurrence of 24 and 42
        int count24 = 0;
        int count42 = 0;

        //For loop to iterate through the whole array
        for (int i = 0; i < array3.length; i++){

            //If statement to check occurrence of 2 next to 4 and increase its value accordingly
            if (array3[i] == 2 && i > 0 && array3[i-1] == 4){
                count42++;
            }
            //If to check 4 next to 2 and increase its value accordingly
            if (array3[i] == 4 && i > 0 && array3[i-1] == 2){
                count24++;
            }
        }

        //For loop to iterate through the whole array
        for (int i = 0; i < array3.length; i++){

            //If to check 4 is shared between both 2-4 and 4-2
            if (array3[i] == 2 && array3[i+1] == 4 && array3[i+2] == 2){

                //If another 4-2 present then return false
                if (count42 > 1){
                    return false;
                }
                //Otherwise return true
                else {
                    return true;
                }
            }
            //Nested if-else to assign return type
            if (count42 != 0 && count24 != 0){
                return false;
            } else if (count24 != 0) {
                return true;
            } else if (count42!=0) {
                return true;
            }
        }
        return false;
    }
    //End of both242 method
}
