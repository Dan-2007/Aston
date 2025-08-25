package org.example.task5.cor;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("A")) {
            System.out.println("ConcreteHandlerA processed the request: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}