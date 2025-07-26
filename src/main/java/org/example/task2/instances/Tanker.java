package org.example.task2.instances;

import org.example.task2.Vehicle;
import org.example.task2.interfaces.FreightCarrying;
import org.example.task2.interfaces.PropellerDriven;

public class Tanker extends Vehicle implements PropellerDriven, FreightCarrying {
public Tanker(String name) {
    super(name);
}
    @Override
    public void move() {
        System.out.println("Toot-toot-toot");
    }

    @Override
    public void carryFreight() {
        System.out.println("Oceanic freight carrying");
    }

    @Override
    public void offWeGo() {
        System.out.println("Propellers on!");
    }
}
