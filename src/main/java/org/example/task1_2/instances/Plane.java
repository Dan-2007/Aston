package org.example.task1_2.instances;

import org.example.task1_2.Vehicle;
import org.example.task1_2.interfaces.FreightCarrying;
import org.example.task1_2.interfaces.PropellerDriven;
import org.example.task1_2.interfaces.Wheeled;
import org.example.task1_2.interfaces.Winged;

public class Plane extends Vehicle implements Winged, Wheeled, PropellerDriven, FreightCarrying {
    public Plane(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println("Whoosh-whoosh-whoosh");
    }

    @Override
    public void carryFreight() {
        System.out.println("Air freight carrying");
    }

    @Override
    public void offWeGo() {
        System.out.println("Prop clear!");
    }

    @Override
    public void drive() {
        System.out.println("Driving on a runway");
    }

    @Override
    public void fly() {
        System.out.println("Air is ours!");
    }
}
