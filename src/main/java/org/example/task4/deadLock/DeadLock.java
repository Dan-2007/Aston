package org.example.task4.deadLock;

public class DeadLock {
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        deadLock.createDeadLock();
    }

    public void createDeadLock() {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                // Pause to increase chances of deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Thread 1: waiting to lock resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                // Pause to increase chances of deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Thread 2: waiting to lock resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
