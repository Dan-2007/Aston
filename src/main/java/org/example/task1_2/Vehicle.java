package org.example.task1_2;

public abstract class Vehicle {
    private String name;
    public Vehicle(String name) {
        this.name = name;
    }


    public abstract void move();
}
