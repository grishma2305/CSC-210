import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows you want: ");
        int rows = input.nextInt();

        System.out.print("Enter the maximum number of element per row you want: ");
        int cols = input.nextInt();

        int [] [] matrix = new int[rows][cols];

        System.out.println("Enter values for a table with " + matrix.length + " rows and " + matrix[0].length + " columns");

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                System.out.print("Enter value for row " + row + " and column " + col + ": ");
                matrix[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                sum += matrix[row][col];
            }
        }
        System.out.println("Sum is " + sum);

        String[][] friends = {
                {"", "*", "", "*", "*"},
                {"*", "", "*", "", "*"},
                {"", "*", "", "", ""},
                {"*", "", "", "", "*"},
                {"*", "*", "", "*", ""}
        };

        int sumPair = 0;

        for (int row = 0; row < friends.length; row++){
            for (int col = 0; col < friends[row].length; col++){
                System.out.print(friends[row][col] + "   ");
                if (friends[row][col].equals("*")){
                    sumPair++;
                }
            }
            System.out.println();
        }
        System.out.println("Total friend pairs are " + sumPair/2);

        //Count friends of friends
        //for 2 it has t2 friend of a friend that is 0 and 4 which are friends of 1
    }
}
