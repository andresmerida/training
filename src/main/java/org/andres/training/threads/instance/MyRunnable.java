package org.andres.training.threads.instance;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.printf("Executing runnable %s, id: %s",
                Thread.currentThread().getName() ,
                Thread.currentThread().threadId());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyRunnable");
        thread.start();
    }
}
