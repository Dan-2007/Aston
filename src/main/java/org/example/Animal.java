package org.example;

public abstract class Animal {
    private final String name;

    protected String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
