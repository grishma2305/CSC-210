public class ArrayLoop {

    public static void main(String[] args){

        //Declaration of int array
        int[] array = {6, 48, 67};

        //For loop to iterate through the whole array and add 5
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] + 5;
        }

        //For loop to print out all items in array
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
    }
}
