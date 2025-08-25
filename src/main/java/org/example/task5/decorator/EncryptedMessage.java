package org.example.task5.decorator;

public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encrypt(message.getContent());
    }

    private String encrypt(String text) {
        // The simplest text edition, for example:
        return new StringBuilder(text).reverse().toString();
    }
}