package org.example.task1_2;

import org.example.task1_2.instances.Truck;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Truck truck = new Truck("Mitsubishi L200");
            Field fieldName = truck
                .getClass()
                .getSuperclass()
                .getDeclaredField("name");
            fieldName.setAccessible(true);
        System.out.println(fieldName.get(truck));
        truck.move();
        truck.carryFreight();
        truck.drive();
    }
}
