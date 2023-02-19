/*
 * Lab: Lab 8
 * Description: Garden with multidimensional array
 * Name: Grishma Maheshbhai Thumar
 * ID: 922955012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

public class Garden {

    public static void main(String[] args) {
        /*
            Initial setup of array:
                0 0 0 1
                0 1 0 0
                0 0 0 1
         */
        // Part 1.1: Setup array named garden, with initial values
        int[][] garden = {
                {0, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 0, 1}
        };
        // Part 1.2B: Calls printGarden method with array as argument
        printGarden(garden);

        // Part 2.1B: Calls addFlower method with array, 0 (as row number) and 1(as column number)
        addFlower(garden, 0, 1);

        // Part 3.1B: DONE - NO MODIFICATIONS NEEDED
        // Note: Must finish Part 1.1 first for error to go away
        System.out.println("\nFlowers in Col 1: " + countFlowersColumn(garden, 1));
        // Part 3.2B: DONE - NO MODIFICATIONS NEEDED
        // Note: Must finish Part 1.1 first for error to go away
        System.out.println("Flowers in Row 1: " + countFlowersRow(garden, 1));
    }


    // Part 1.2A: Implement method
    /*
        printGarden()
        No return type
        1 2D array parameter
     */
    public static void printGarden(int[][] garden) {
        // Nested For Loop to iterate through the 2D array
        // Outer Loop: Loops through all the rows
        for (int row = 0; row < garden.length; row++) { // Fill in initialization, condition, incrementation
            // Inner Loop: Loops through all the columns
            for (int column = 0; column < garden[row].length; column++) { // Fill in initialization, condition, incrementation
                // Prints out value at [row][column] in array, with a space behind
                System.out.print(garden[row][column] + " ");
            }
            // Skip a line
            System.out.println();
        }
    }

    // Part 2.1A: Implement method
    /*
        addFlower()
        No return type
        3 parameters - 1 2D array, 2 integers
     */
    public static void addFlower(int[][] garden, int row, int column) {
        // Set value at [row][column] equals to 1
        garden[row][column] = 1;
        // Skip a line
        System.out.println();
        // Calls printGarden() with array from parameter as argument
        printGarden(garden);
    }

    // Part 3.1A: Implement method
    /*
        countFlowersColumn()
        integer return type
        2 parameters - 1 2D array, 1 integer
     */
    public static int countFlowersColumn(int[][] garden, int column) {
        // Set up a counter variable
        int countColumn = 0;
        // For loop that iterates at the designated column
        for (int i = 0; i < garden.length; i++) { // Fill condition, incrementation
            // If value at [i][column] equals 1
            if (garden[i][column] == 1) { // Fill in condition
                // Increment counter variable by 1
                countColumn++;
            }
        }
        // Return counter variable
        // IMPORTANT: MUST RETURN AN INTEGER TYPE
        return countColumn;
    }

    // Part 3.2A: Implement method
    /*
        countFlowersRow()
        integer return type
        2 parameters - 1 2D array, 1 integer
     */
    public static int countFlowersRow(int[][] garden, int row) {
        // Set up a counter variable
        int countRow = 0;
        // For loop that iterates at the designated column
        for (int j = 0; j < garden.length; j++) { // Fill condition, incrementation
            // If value at [row][j] equals 1
            if (garden[row][j] == 1) { // Fill in condition
                // Increment counter variable by 1
                countRow++;
            }
        }
        // Return counter variable
        // IMPORTANT: MUST RETURN AN INTEGER TYPE
        return countRow;
    }

}



