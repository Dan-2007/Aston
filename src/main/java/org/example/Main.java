package org.example;

import org.example.instances.Bear;
import org.example.instances.Kitty;
import org.example.instances.Whale;


public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Salmon") {
        };
        Class<?> fishClass = fish.getClass().getSuperclass();
        System.out.printf("%s is a %s and ", fish.getName(), fishClass.getSimpleName());
        fish.livesUnderwater();
        Bear bear = new Bear("Grisly", true);
        System.out.printf("%s is %s and %s%n", bear.getName(), bear.isFurry ? "furry" : "bold", bear.IS_VERTEBRATE() ? "vertebrate" : "invertebrate");
        Whale whale = new Whale("Blue Whale");
        System.out.printf("%s is a %s, has %s fur and ", whale.getName(), whale.getClass().getSimpleName(), whale.isFurry ? "": "no");
        whale.livesUnderwater();
        Kitty kitty = new Kitty("Lion", true);
        System.out.printf("%s is %s and %s%n", kitty.getName(), kitty.isFurry ? "furry" : "bold", kitty.IS_VERTEBRATE() ? "vertebrate" : "invertebrate");
    }
}