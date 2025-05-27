package org.andres.threads.first_example;

public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }

    public static void main(String[] args) {
        HelloThread thread = new HelloThread();
        thread.start();
    }
}
