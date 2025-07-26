package org.example.task2.instances;

import org.example.task2.Vehicle;
import org.example.task2.interfaces.FreightCarrying;
import org.example.task2.interfaces.Wheeled;

public class Truck extends Vehicle implements Wheeled, FreightCarrying {
    public Truck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Honk-honk-honk");
    }

    @Override
    public void carryFreight() {
        System.out.println("Highway freight carrying");
    }

    @Override
    public void drive() {
        System.out.println("Truckman on the go!");
    }
}
