package org.andres.training.anytests.runnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorService3 {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

        // 1. Schedule a task to run once after 3 seconds
        executor.schedule(() -> {
            System.out.println("One-time task executed after 3 seconds");
        }, 3, TimeUnit.SECONDS);

        // 2. Schedule a task to run every 5 seconds (fixed-rate)
        executor.scheduleAtFixedRate(() -> {
            System.out.println("Fixed-rate task executed every 5 seconds - " + Thread.currentThread().getName());
        }, 2, 5, TimeUnit.SECONDS);

        // 3. Schedule a task with a fixed delay of 4 seconds after completion
        executor.scheduleWithFixedDelay(() -> {
            System.out.println("Fixed-delay task executed after the 4 seconds - " + Thread.currentThread().getName());
        }, 1, 4, TimeUnit.SECONDS);

        // the scheduler will keep running index
        executor.schedule(() -> {
            System.out.println("Shutting down executor after 20 seconds");
            executor.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
