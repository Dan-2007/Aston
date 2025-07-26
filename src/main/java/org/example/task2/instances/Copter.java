package org.example.task2.instances;

import org.example.task2.Vehicle;
import org.example.task2.interfaces.FreightCarrying;
import org.example.task2.interfaces.PropellerDriven;
import org.example.task2.interfaces.Wheeled;

public class Copter extends Vehicle implements Wheeled, PropellerDriven, FreightCarrying {
    public Copter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Whop-whop-whop");
    }

    @Override
    public void carryFreight() {
        System.out.println("Freight is carrying");
    }

    @Override
    public void offWeGo() {
        System.out.println("Off we go!");
    }

    @Override
    public void drive() {
        System.out.println("Landing on wheels");

    }
}
