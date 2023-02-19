/*
 * Assignment : Assignment 14
 * Description: Cat Class (Child Class of Parent Class that is Animal)
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

//Cat class (Child Class)
public class Cat extends Animal{

    //Properties of cat
    private String breed;
    private String gender;
    private int age;

    //Default constructor
    public Cat(){
        super("Cat");
    }

    //Constructor that takes breed, gender and age as parameters
    public Cat(String breed, String gender, int age){
        super("Cat");
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    //Getters and setters for the above properties
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

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
        return "Meow! Meow!";
    }

    //Overriding the toString method
    @Override
    public String toString(){
        return "Perhaps it is alive.";
    }

    //Main method
    public static void main(String[] args) {
        //Creating an object for cat
        Cat newCat = new Cat();
        //Set the values of the object
        newCat.setAge(3);
        newCat.setGender("Female");
        newCat.setBreed("Turkish Angora");
        newCat.setNumOfLegs(4);
        //Call makeSound and totalLegs method
        System.out.println(newCat.makeSound());
        newCat.totalLegs();

        //Creating an object for cat
        Cat newCat2 = new Cat("Birman", "Female", 2 );
        //Set the values of the object
        newCat2.setNumOfLegs(4);
        newCat2.setAlive(true);
        newCat2.setColor("White");
        //Call the getters
        System.out.println("Cat of " + " age: " + newCat2.getAge() + ", breed: " + newCat2.getBreed() +
                ", gender: " + newCat2.getGender() + ", color: " + newCat2.getColor() + " is alive: " + newCat2.isAlive());
        //Call makeSound method
        System.out.println(newCat2.makeSound());
    }
}
