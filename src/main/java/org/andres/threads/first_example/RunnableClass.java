package org.andres.threads.first_example;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World from RunnableClass");
    }
}
