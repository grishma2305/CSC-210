public class Final {
    public static void main(String[] args) {
        int[][] numberArray = {{3, 4, 5, 6, 3}, {1, 1, 1}, {2, 3, 3, 3, 5, 5, 3, 3}};
        int target = 3;

        // ADD YOUR CODE HERE AND WRITE AN ADDITIONAL METHOD -- SEE EXAMPLE ABOVE FOR METHOD NAME AND SIGNATURE //
        numOfOccurrences(numberArray,target);
    }

    public static void numOfOccurrences (int[][] numberArray, int target){
        for (int i = 0; i < numberArray.length; i++){
            int countOfOccurrence = 0;
            for (int j = 0; j < numberArray[i].length; j++){
                if (numberArray[i][j] == target){
                    countOfOccurrence++;
                }
            }
            System.out.println("There are " + countOfOccurrence + " occurrences of " + target + " in row " + i);
        }
    }
}
