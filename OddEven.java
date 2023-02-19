import java.util.Arrays;

public class OddEven {

    //Start of main method
    public static void main(String[] args){

        //Declaration and assignment of array
        int[] array = {2,5,3,4,7,8,10};

        //Printing and calling the rearrange method
        System.out.println("Given array in rearranged form is " + Arrays.toString(rearrange(array)));


        System.out.println("True is " + t111(8,8,7));

    }

    //Start of main method
    public static int[] rearrange(int[] arr){

        //Declaration and assignment of variables
        int even = 0;
        int odd = arr.length-1;
        int[] newarray = new int[arr.length];

        //For loop to iterate through the whole array
        for (int i = 0; i < arr.length; i++){

            //If statement to check whether the number is even and assign its position
            if (arr[i] % 2 == 0) {
                newarray[even] = arr[i];
                even++;
            }
            //Else if the number is odd then assign its position
            else {
                newarray[odd] = arr[i];
                odd--;
            }
        }

        //Return the new array
        return newarray;
    }

    public static boolean t111(int a, int b, int c){
        if (!((a != b) && (a != c) && (b != c)

        )){
            return true;
        }
        return false;
    }
}
