package org.andres.training.anytests.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService1 {
    public static void main(String[] args) {
        Runnable printInventory = () -> System.out.println("Printing inventory");

        Runnable printRecords = () -> {
            for (int i=0; i<3; i++) {
                System.out.println("Printing record " + i);
            }
        };

        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            System.out.println("Starting thread");
            executorService.execute(printInventory);
            executorService.execute(printRecords);
            executorService.execute(printInventory);
            System.out.println("Shutting down thread");
        }
    }
}
