public class SumExamples {

    public static void main(String[] args){

        int sumFrom1to5;

        sumFrom1to5 = sum(1,5); //15

        System.out.println("Inside main method: The sum is: " + sumFrom1to5);

        sum(29,72);

        sum(37,21); //Will give 0 because the order is not correct and for loop does not run

        sum(21,37); //Now will give the correct sum

        //Can also do like this   (Can also use scanner)
        int low = 5, high = 9;
        sum(low, high);
        //OR
        System.out.println("The sum is: " + sum(low, high));

    }

    public static int sum(int lower, int upper){

        int total = 0;

        for (int i = lower; i <= upper; i++ ) {
            total = total + i;
        }

        System.out.println("Inside sum method: The sum is: " + total);
        return  total;
    }

}
