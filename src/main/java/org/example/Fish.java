package org.example;

import org.example.interfaces.Underwater;

public abstract class Fish extends Animal implements Underwater {

    public Fish(String name) {
        super(name);
    }
}
