package org.andres.training.anytests.runnable;

public class Task1 implements Runnable {
    private final String name;

    public Task1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " => " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("e = " + e.getMessage());
        }
    }
}
