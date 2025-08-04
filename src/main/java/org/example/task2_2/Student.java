package org.example.task2_2;

import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private List<Book> books;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Student " + getName() + " " + getLastName() + " has books: " + books;
    }

    public Student(String name, String lastName, List<Book> books) {
        this.name = name;
        this.lastName = lastName;
        this.books = books;
    }
}
