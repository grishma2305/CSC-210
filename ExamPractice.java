import java.util.Arrays;
import java.util.Scanner;

public class ExamPractice {
    public static int main(String[] args){
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

        return 0;
    }
}
