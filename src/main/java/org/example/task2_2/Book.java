package org.example.task2_2;

public class Book {
    private String title;
    private String author;
    private int year;
    private int pages;

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  getTitle() +
                ", author: "
                + getAuthor() +
                ", was published in "
                + getYear();

    }

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

}
