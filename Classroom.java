/*
 * Lab: Chapter 9 Lab Part 2
 * Description: Class and Objects
 * Name: Grishma Maheshbhai Thumar
 * ID: 922955012
 * Class: CSC 211-06
 * Semester: Fall 2022
 */

public class Classroom {
    //Declaring private and public variables
    private int roomNum;
    private int capacity;
    public static int classroomCount = 0;

    //Creating a classroom constructor
    public Classroom(int roomNumArg, int capacityArg){
        //Assignment of values to variables
        roomNum = roomNumArg;
        capacity = capacityArg;
        classroomCount++;
    }

    //Get method to get the room number
    public int getRoomNum(){
        //Return the room num
        return this.roomNum;
    }

    //Set method to assign value
    public void setRoomNum(int newRoomNum){
        //Assignment to value
        this.roomNum = newRoomNum;
    }

    //Get method to get the capacity
    public int getCapacity(){
        //Return the capacity of classroom
        return this.capacity;
    }

    //Set method to assign value
    public void setCapacity(int capacityArg){
        //Assignment to value
        this.capacity = capacityArg;
    }

    //Get method to get classroom count
    public static int getClassroomCount(){
        //Return the count
        return classroomCount;
    }
}
