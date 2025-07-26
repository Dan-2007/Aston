package org.example.task1;

import org.example.task1.interfaces.Underwater;

public abstract class Fish extends Animal implements Underwater {

    public Fish(String name) {
        super(name);
    }
}
