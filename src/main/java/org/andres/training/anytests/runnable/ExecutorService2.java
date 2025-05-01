package org.andres.training.anytests.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Executor created and running");
        // Step 2: Submit tasks

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Running task " + taskId
                        + " on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // step 3: Initiate shutdown
        System.out.println("shutting down executor service");
        executorService.shutdown();

        // step 4: Wait for termination
        try {
            if (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Executor did not terminate");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        // step 5: confirm termination
        if (executorService.isTerminated()) {
            System.out.println("Executor is terminated");
        } else {
            System.out.println("Some tasks were not executed");
        }
    }
}
