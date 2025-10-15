package org.andres.threads.first_example;

public class MainWithPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloRunnable());
        t1.setName("first thread");
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread(new HelloRunnable());
        t2.setName("second thread");
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
