public class StringMethod {

    //Start of main method
    public static void main(String[] args){

        //Declaration and assignment of name
        String bob = "Bob";

        //Printing and calling the name method
        System.out.println(name(bob));
    }

    //Start of name method
    public static String name(String userName){

        //Return a greeting string
        return ("Hello " + userName + "!");
    }
}
