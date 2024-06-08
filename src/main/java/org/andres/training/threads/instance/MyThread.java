package org.andres.training.threads.instance;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("Executing MyThread: Name: %s, id: %s",
                Thread.currentThread().getName(),
                Thread.currentThread().threadId());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread("Thread1");
        myThread.start();
    }
}
