/*
 * Lab: Lab 11
 * Description: Inheritance (contains child class named Triangle)
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

//Start of child class Triangle
public class Triangle extends Shape{
    //Declaration of data members
    int base;
    int height;

    //Start of Triangle method
    public Triangle(int base, int height){
        //Invoke parent constructor
        super(3);
        //Setting of values
        this.base = base;
        this.height = height;
    }
    //End of Triangle method

    //Start of getArea method
    public float getArea(){
        //Return the area
        return (base * height) / 2;
    }
    //End of getArea method
}
//Start of child class Triangle

