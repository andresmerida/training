package org.andres.threads.first_example;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a runnable. Identity: " + Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
    }
}
