package org.example.task3;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        try {
            start();
        } catch (MyReadException e) {
            System.out.println("Cannot read line. " + e);
        } catch (MyWriteException e) {
            System.out.println("Cannot write line. " + e);
        }
    }

    private static void start() throws MyWriteException, MyReadException {
        try (FileWriter writer = new FileWriter("T.file", false)) {
            writer.write("One more string into it!\n");
        } catch (IOException exception) {
            throw new MyWriteException(exception);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("ile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException exception) {
            throw new MyReadException(exception);
        }
    }
}
