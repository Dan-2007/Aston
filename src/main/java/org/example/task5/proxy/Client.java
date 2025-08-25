package org.example.task5.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("photo.jpg");

        // The image will load only on the first invocation of the display method.:
        image.display();
        image.display();
    }
}