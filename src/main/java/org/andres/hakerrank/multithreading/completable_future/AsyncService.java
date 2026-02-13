package org.andres.hakerrank.multithreading.completable_future;

import java.util.concurrent.CompletableFuture;

public class AsyncService {
    public void processUserData(String userId) {
        // start fetching profile and balance in parallel
        CompletableFuture<String> profileFuture = CompletableFuture.supplyAsync(() -> fetchProfile(userId));
        CompletableFuture<Double> balanceFuture = CompletableFuture.supplyAsync(() -> fetchBalance(userId));

        // combine results when both are ready
        CompletableFuture<String> resultFuture = profileFuture.thenCombine(balanceFuture, (profile, balance)
                -> "User: " + profile + " has a risk score of: " + (balance < 0 ? "High" : "Low"));

        // handling potential errors or timeouts
        resultFuture.handle((res, ex) -> {
            if (ex != null) {
                return "Error processing user: " + ex.getMessage();
            } else {
                return res;
            }
        }).thenAccept(IO::println);

        // keep the main thread alive for the demo
        resultFuture.join();
    }

    private String fetchProfile(String id) {
        sleep(1000);    // simulate network latency
        return "John Doe";
    }

    private Double fetchBalance(String id) {
        sleep(1200);
        return 250.50;
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            IO.println("Interrupted: " + e.getMessage());
        }
    }
}
