package org.example.task1_1;

import org.example.task1_1.interfaces.Underwater;

public abstract class Fish extends Animal implements Underwater {

    public Fish(String name) {
        super(name);
    }
}
