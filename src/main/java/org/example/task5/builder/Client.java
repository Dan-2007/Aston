package org.example.task5.builder;

public class Client {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Ivan", "Ivanov")
                .age(30)
                .phone("+123456789")
                .address("Moscow")
                .build();

        System.out.println(user);
    }
}