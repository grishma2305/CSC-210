/*
 * Assignment : Assignment 14
 * Description: Human Class (Child Class of Parent Class that is Animal)
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

//Human class (Child Class)
public class Human extends Animal{

    //Properties of Human
    private String gender;
    private int age;

    //Default constructor
    public Human(){
        super("Human");
    }

    //Constructor that takes numOfLegs, gender and age as parameters
    public Human(int numOfLegs, String gender, int age){
        super("Human");
        this.numOfLegs = numOfLegs;
        this.gender = gender;
        this.age = age;
    }

    //Getters and setters for the above properties
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Overriding the makeSound method
    @Override
    public String makeSound(){
        return "We speak various languages!";
    }

    //Overriding the toString method
    @Override
    public String toString(){
        return "Perhaps they are alive.";
    }

    //Main method
    public static void main(String[] args){
        //Creating an object for human
        Human newHuman = new Human();
        //Set the values of the object
        newHuman.setAge(20);
        newHuman.setGender("Male");
        newHuman.setNumOfLegs(2);
        //Call makeSound and totalLegs method
        System.out.println(newHuman.makeSound());
        newHuman.totalLegs();

        //Creating an object for human
        Human newHuman2 = new Human(2,"Female", 15);
        //Set the values of the object
        newHuman2.setName("Elora");
        //Call the getters
        System.out.println("Human of " + newHuman2.getNumOfLegs() + " number of legs, gender: " + newHuman2.getGender() +
                ", age: " + newHuman2.getAge() + " has name " + newHuman2.getName());
        //Call makeSound method
        System.out.println(newHuman2.makeSound());
    }
}
