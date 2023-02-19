/*
 * Lab: Review #2
 * Course: CSC 211-05/08 - Fall 2021
 * File: Gate.java
 * DO NOT MODIFY OR SUBMIT THIS FILE
 */

public class Gate {
    private String name;
    private int length;

    public Gate() {
        name = "N/A";
        length = 0;
    }

    public Gate(String newName, int newLength) {
        name = newName;
        length = newLength;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }
}
