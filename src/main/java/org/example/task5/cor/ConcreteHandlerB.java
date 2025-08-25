package org.example.task5.cor;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("B")) {
            System.out.println("ConcreteHandlerB processed the request: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}