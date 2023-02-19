/*
 * Assignment : Assignment 14
 * Description: Animal Class (Parent Class)
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */


//Animal Class (Parent Class)
public class Animal {

    //Properties of animal
    protected String name;
    protected String color;
    protected int numOfLegs;
    protected boolean isAlive;

    //Default Constructor
    public Animal(){
        this.name = "Unknown";
    }

    //Constructor with name as parameter
    public Animal(String name){
        this.name =  name;
    }

    //Constructor with name, color, numOfLegs and isAlive as parameters
    public Animal(String name, String color, int numOfLegs, boolean isAlive){
        this.name = name;
        this.color = color;
        this.numOfLegs = numOfLegs;
        this.isAlive = isAlive;
    }

    //Getters and Setters for the properties defined above
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //Method to check if animal is alive or not
    public boolean isAlive() {
        return isAlive;
    }

    //Method to return the sound of animal as a string
    public String makeSound(){
        return "Animals make sound!";
    }

    //Method to check the numOfLegs of animal
    public void totalLegs(){
        System.out.println("The animal has " + getNumOfLegs() + " number of legs.");
    }

    //Method to check the name and isAlive condition
    public String toString(){
        return "Animal of name: " + name + " is alive: " + isAlive;
    }
}
