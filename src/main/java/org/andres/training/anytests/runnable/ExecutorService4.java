package org.andres.training.anytests.runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (var executor = Executors.newSingleThreadExecutor()) {
            Future<Integer> future = executor.submit(() -> 30 + 11);
            System.out.println(future.get());   // 41
        }
    }
}
