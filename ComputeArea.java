import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius; //Declaration
        double area;
        final double PI=3.14159;

        System.out.println("Enter the radius of your circle: ");
        radius = input.nextDouble();

        if(radius >= 0) {
            area = radius * radius * PI;
            System.out.println("The area of the circle with radius " + radius + " is " + area);
        } else {
            System.out.println("The circle's size is invalid.");
        }

    }
}
