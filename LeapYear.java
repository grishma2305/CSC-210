public class LeapYear {
    public static void main(String[] args){
        int year = 2000;

        //if divisible by 4 but not by 100
        boolean firstCondition;
        firstCondition = (year % 4 ==0) && (year % 100 !=0);

        //if it is perfectly divisible by 400
        boolean secondCondition;
        secondCondition = (year % 400 ==0);

        boolean isLeapYear;
        isLeapYear = (firstCondition) || (secondCondition);

        //isLeapYear = ((year % 4 ==0) && (year % 100 !=0)) || (firstCondition) || (secondCondition); //can also write like this

        if(isLeapYear){
            System.out.println("The year " + year + " is a leap year");
        }
        else{
            System.out.println("The year " + year + " is not a leap year");
        }
    }
}
