/*
 * Lab: Lab 11
 * Description: Inheritance (contains child class rectangle)
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

//Start of child class Rectangle
public class Rectangle extends Shape{
    //Declaration of data members
    int length;
    int width;

    //Start of rectangle method
    public Rectangle(int length, int width){
        //Invoke parent constructor
        super(4);
        //Setting of values
        this.length = length;
        this.width = width;
    }
    //End of rectangle method

    //Start of getArea method
    public float getArea(){
        //Return the area
        return length * width;
    }
    //End of getArea method

}
//End of child class Rectangle

