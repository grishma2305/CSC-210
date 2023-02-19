import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args){

        Scanner inputObj = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter: ");
        int size = inputObj.nextInt();

        double[] userValues = new double[size];

        System.out.println();

        for (int i=0; i<size; i++){
            System.out.println("Enter a number: ");
            userValues[i] = inputObj.nextDouble();
        }

        //Check what is enhanced for loop
        for (double userValue : userValues) {
            System.out.print(userValue + " ");
        }

        double sum = 0.0;
        for (int i=0; i< userValues.length; i++){
            sum += userValues[i];
        }

        System.out.println();

        double average = sum/size;
        System.out.println("The average of the number is " + average);

        int x=4, y=3;
        if(!(x<3||y>2))
            System.out.println("First case");
        else
            System.out.println("SEcond case");

        practicepro();
    }

     public static void practicepro() {
        int sum = 0;
        int digit4 = 4;
        int digit5 = 5;
        int[] array = {1,2,4,3,5,6,7,8};
        for (int i = 0; i< array.length; i++){

            if (array[i]!=4){
                sum += array[i];
            }
            else if (array[i] == 4){
                for (int j = 0; j<array.length; j++){

                }
            }
        }
         System.out.println(sum);
     }
}
