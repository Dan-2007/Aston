package org.example.task1;

public abstract class Mammal extends Animal {

    protected boolean isFurry;

    protected final boolean IS_VERTEBRATE() {
        return true;
    }

    public Mammal(String name) {
        super(name);
    }

}
