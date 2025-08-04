package org.example.task2_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("ABC", "Theodor Seuss Geisel", 2001, 64),
                new Book("I eat Poop", "Mark Pett", 2002, 48),
                new Book ("Politics for Dummies", "Ann Delaney", 2002, 384),
                new Book("The Bible", "Probably, God", 1, 600),
                new Book("1984", "George Orwell", 1949, 328),
                new Book("Pride and Prejudice","Jane Austen", 1813, 432),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 336),
                new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866, 720),
                new Book("Moby Dick", "Herman Melville", 1851, 635),
                new Book("The Grapes of Wrath", "John Steinbeck", 1939, 464),
                new Book("Madame Bovary", "Gustave Flaubert", 1857, 450),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez",1967, 417),
                new Book("The Brothers Karamazov", "Fyodor Dostoevsky", 1880, 729),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 214),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 208),
                new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 1178),
                new Book("The Stranger", "Albert Camus", 1942, 184),
                new Book("War and Peace", "Leo Tolstoy", 1869, 1200),
                new Book("Mein Kampf", "Adolf Schicklgruber", 1925, 720));
        List<Student> students = Arrays.asList(
                new Student("George", "Bush", Arrays.asList(
                        books.get(0),
                        books.get(1),
                        books.get(2),
                        books.get(3),
                        books.get(17)
                )),
                new Student("Shinzo", "Abe", Arrays.asList(
                        books.get(2),
                        books.get(7),
                        books.get(8),
                        books.get(10),
                        books.get(18)
                )),
                new Student("Keir", "Starmer", Arrays.asList(
                        books.get(0),
                        books.get(1),
                        books.get(2),
                        books.get(3),
                        books.get(5)
                )),
                new Student("Friedrich", "Merz", Arrays.asList(
                        books.get(18),
                        books.get(0),
                        books.get(1),
                        books.get(3),
                        books.get(7)
                )),
                new Student("Vlad", "Shelomov", Arrays.asList(
                        books.get(1),
                        books.get(4),
                        books.get(7),
                        books.get(11),
                        books.get(18)
                ))
        );



        students.stream()
                .peek(System.out::println)
                .flatMap(s -> s.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(b -> b.getYear() > 2000)
                .limit(3)
                .findFirst()
                .ifPresentOrElse(System.out::println,
                                () -> System.out.println("There's no such book"));

    }
}
