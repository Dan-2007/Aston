package org.example.task5.decorator;

public abstract class MessageDecorator implements Message {
    protected final Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }
}