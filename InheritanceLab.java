/*
 * Lab: Lab 11
 * Description: Inheritance (contains main method)
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

//Start of InheritanceLab class
public class InheritanceLab {
    //Start of main method
    public static void main(String[] args) {

        //Calling Shape(parent) class and print out the values
        Shape shape = new Shape(0);
        System.out.println(shape.getArea());
        System.out.println(shape);

        //Calling Rectangle(child) class and print out the values
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        //Calling triangle(child) class and print out the values
        Triangle triangle = new Triangle(4, 7);
        System.out.println(triangle.getArea());
        System.out.println(triangle);

        System.out.println();System.out.println();

        //For loop to iterate through the whole array
        Shape[] shapeArray = new Shape[10];
        for (int x = 0; x < 10; x++) {
            if (x % 2 == 0) {
                shapeArray[x] = new Rectangle(x, x);
            }
            else {
                shapeArray[x] = new Triangle(x, x);
            }
        }

        //For loop to print out values
        for (int x = 0; x < 10; x++) {
            System.out.println(shapeArray[x]);
            System.out.println(shapeArray[x].getArea());
        }
    }
    //Start of main method
}
//End of InheritanceLab class

