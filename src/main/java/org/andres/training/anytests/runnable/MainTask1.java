package org.andres.training.anytests.runnable;

public class MainTask1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Task1 task = new Task1("Task # " + i);
            Thread thread = new Thread(task);
            thread.start();
        }
        System.out.println("MainTask1 finished");
    }
}
