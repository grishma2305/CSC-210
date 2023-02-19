import java.util.Scanner;

public class Example {

    public static void main(String[] args){

        // Create the Scanner and 2D array
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[2][3];

        // Prompt user to enter values
        System.out.println("Enter values for a table with " + matrix.length + " rows and " + matrix[0].length + " columns:");

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                System.out.print("Enter value for row " + row + " and column " + col + " : ");
                matrix[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
