package org.andres.training.anytests.runnable;

import java.util.concurrent.*;

public class ExecutorService5 {
    public static void main(String[] args) {
        Callable<String> callable = () -> {
            Thread.sleep(10000);    // simulate work
            return "Result from callable on thread: " + Thread.currentThread().getName();
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);

        try {
            System.out.println("Waiting for callable to complete...");
            System.out.println("Callable Result: " + future.get(11, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        } catch (ExecutionException e) {
            System.out.println("ExecutionException: " + e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("TimeoutException: " + e.getMessage());
        }
    }
}
