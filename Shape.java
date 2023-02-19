/*
 * Lab: Lab 11
 * Description: Inheritance (contains parent class named Shape)
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */


//Start of parent class
public class Shape {
    //Declaration of data member
    int vertexCount;

    //Start of shape method
    public Shape(int vertexCount){
        //Setting the value of vertex count
        this.vertexCount = vertexCount;
    }
    //End of shape method

    //Start of getArea method
    public float getArea(){
        //Returning its value as 0
        return 0;
    }
    //End of getArea method

    //Start of toString method
    public String toString(){
        //Return the string output
        return "vertexCount: " + vertexCount;
    }
    //End of toString method
}
//End of parent class
