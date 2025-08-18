package org.example.task4;

public class AlternatingThreads {
    private final Object lock = new Object();
    private boolean printOne = true;

    public static void main(String[] args) {
        AlternatingThreads at = new AlternatingThreads();
        at.startThreads();
    }

    public void startThreads() {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!printOne) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("1");
                    printOne = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (printOne) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("2");
                    printOne = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}