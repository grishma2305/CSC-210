import java.util.Arrays;
import java.util.Scanner;

public class TestMax {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");

        int[] numbers = new int[10];

        for (int i=0; i< numbers.length; i++){
            int num = input.nextInt();

            if (num==2){
                num=0;
            }
            numbers[i] = num;
        }
        System.out.println("Array is " + Arrays.toString(numbers));
        //return 0;

        int value1 = 3;
        int value2 = 7  ;

        max(value1, value2);
        System.out.println("The max is " + max(value1, value2));
    }

    public static int max(int int1, int int2){
        int result = 0;
        if(int1>int2) {
            result = int1;
        }
        else {
            result = int2;
        }
        return result;
    }
}
