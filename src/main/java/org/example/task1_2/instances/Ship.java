package org.example.task1_2.instances;

import org.example.task1_2.Vehicle;
import org.example.task1_2.interfaces.FreightCarrying;
import org.example.task1_2.interfaces.PropellerDriven;

public class Ship extends Vehicle implements PropellerDriven, FreightCarrying {
    public Ship(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println("Chug-chug-chug");
    }

    @Override
    public void carryFreight() {
        System.out.println("Coast freight carrying");
    }

    @Override
    public void offWeGo() {
        System.out.println("Start propeller!");

    }
}
