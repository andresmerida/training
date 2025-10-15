package org.andres.threads.first_example;

public class MainTheadClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
    }
}
