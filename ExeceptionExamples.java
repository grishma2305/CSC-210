import java.util.Scanner;

public class ExeceptionExamples {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int[] arr = {23, 56, 58};

        System.out.print("Enter the index whose value you want: ");
        int userIndex = inputObj.nextInt();

        try {
            System.out.println(arr[userIndex]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You went out of bounds! Do better!!!");
        }
        System.out.println("End of program");
    }
}
