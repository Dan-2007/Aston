package org.example.task5.decorator;

public class Client {
    public static void main(String[] args) {
        Message message = new SimpleMessage("Hello <World> & everyone!");
        System.out.println("Original: " + message.getContent());

        Message htmlEncoded = new HtmlEncodedMessage(message);
        System.out.println("HTML Encoded: " + htmlEncoded.getContent());

        Message encrypted = new EncryptedMessage(htmlEncoded);
        System.out.println("Encrypted & HTML Encoded: " + encrypted.getContent());
    }
}