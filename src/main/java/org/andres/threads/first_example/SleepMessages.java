package org.andres.threads.first_example;

import java.time.LocalDateTime;

public class SleepMessages {
    public static void main(String[] args) {
        String importantInfo[] = {"Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too"};

        for (String message : importantInfo) {
            System.out.println("Current time: " + LocalDateTime.now());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // we've been interrupted: no more messages
                return;
            }
            System.out.println(message);
        }
    }
}
