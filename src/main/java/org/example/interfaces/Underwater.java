package org.example.interfaces;

public interface Underwater {

    default void livesUnderwater() {
        System.out.println("lives underwater");
    }
}
