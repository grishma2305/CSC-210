public class MidtermMakeup {

    //Start of main method
    public static void main(String[] args){

        //Declaration and call isArrayFull method
        int[] array = {1, 0, 4, 5, 6};
        System.out.println("Result of isArrayFull method is: " + isArrayFull(array));

        //Declaration and call universe42 method
        int[] arr = {1, 4, 2, 1, 4, 2};
        System.out.println("Result of universe42 method is: " + universe42(arr));

        //Declaration and call both242 method
        int[] arr3 = {2, 4, 2};
        System.out.println("Result of both242 method is: " + both242(arr3));
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
