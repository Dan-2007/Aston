package org.example.task1_2;

import org.example.task1_2.instances.Truck;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Truck truck = new Truck("FreightLiner Columbia");
        Field fieldName = truck
                .getClass()
                .getSuperclass()
                .getDeclaredField("name");
        fieldName.setAccessible(true);
        System.out.println("Truck's make 'n' model: " + fieldName.get(truck));
        truck.move();
        truck.carryFreight();
        truck.drive();
    }
}
