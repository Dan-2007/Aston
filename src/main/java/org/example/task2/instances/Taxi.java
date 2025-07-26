package org.example.task2.instances;

import org.example.task2.Vehicle;
import org.example.task2.interfaces.Wheeled;

public class Taxi extends Vehicle implements Wheeled {
    public Taxi(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println("Beep-beep-beep");
    }

    @Override
    public void drive() {
        System.out.println("Looking for passengers");
    }
}
