public class Sum {

    //Start of main method
    public static void main(String[] args){

        //Calling the weird sum method and printing the value
        System.out.println("Sum is " + weirdSum(2,6,3));
    }

    //Start of weird sum method
    public static int weirdSum(int a, int b, int c) {

        // Initialize a variable that will store the sum
        int sumOfNum = 0;


        //If statements to assign value to each variable
        if ((a==b) && (a==c)) {
            a = b = c = a * 10;
        }
        else if ((a==b)){
            a = b = a*3;
        }
        else if (a==c) {
            a = c = a*3;
        }
        else if (b==c) {
            b = c =b*3;
        }

        //Assignment of sum
        sumOfNum = a + b + c;

        //Return the sum of numbers
        return sumOfNum;
    }
}
