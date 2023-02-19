/*
 * Lab: Review #2
 * Course: CSC 211-05/08 - Fall 2021
 * File: Airport.java
 * DO NOT MODIFY OR SUBMIT THIS FILE
 */

public class Airport {
    private String name;
    private int count;
    private Gate[] listOfGates = new Gate[10];

    public Airport() {
        name = "N/A";
    }

    public Airport(String newName) {
        name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void addGate(Gate newGate) {
        int size = listOfGates.length;

        if (count == size) {
            return;
        }

        for (int i = 0; i < size; i++)
            if (listOfGates[i] == null) {
                listOfGates[i] = newGate;
                count++;
                break;
            }
    }
}

