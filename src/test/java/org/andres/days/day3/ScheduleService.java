package org.andres.days.day3;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleService {
    private final ScheduledExecutorService scheduledExecutorService =
            Executors.newSingleThreadScheduledExecutor();

    public void printCurrentTimeEveryTwoSeconds() {
        Runnable task = () -> System.out.println(LocalDateTime.now());
        scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }

    public void stopPrinting() {
        scheduledExecutorService.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        var service = new ScheduleService();
        service.printCurrentTimeEveryTwoSeconds();
        Thread.sleep(20_000);
        service.stopPrinting();
    }
}
