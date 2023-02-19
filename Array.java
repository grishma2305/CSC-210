import java.util.Scanner;

public class Array {

    //Start of main method
    public static void main(String[] args){

        //Declaration and assignment of array
        int[] array = {22, 3, 10, 15, 22, 0, 22};

        //Printing and calling the method occur22
        System.out.println("Result is "+ occur22(array));

    }

    //Start of occur22 method
    public static int occur22(int[] array){

        //Declaration of variable to store the occurrence of 22
        int count = 0;

        //For loop to iterate through the whole array
        for (int i =0; i< array.length; i++){

            System.out.println("Enter the number: ");


            //If to check whether 22 is present or not
            if (array[i] == 22){
                count++;
            }
        }

        //Return the total occurrences of 22
        return count;
    }
}
