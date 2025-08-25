package org.example.task5.cor;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNext(handlerB);

        handlerA.handleRequest("Request with A");
        handlerA.handleRequest("Request with B");
        handlerA.handleRequest("Request with C");
    }
}