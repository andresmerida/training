package org.andres.threads.first_example;

public class SimpleThreads {

    // display a message, preceded by the name of the current thread
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable {

        @Override
        public void run() {
            String[] importantInfo = {"Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too"};
            try {
                for (String message : importantInfo) {
                    Thread.sleep(3000); // pause for 3 seconds
                    threadMessage(message);
                }
            } catch (InterruptedException e) {
                threadMessage("I was interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Delay, in milliseconds before we interrupt MessageLoop. Thread (default one hour)
        long patience = 1000 * 60 * 60;    // 1 hour

        // if command line argument present, gives patience in seconds.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException nfe) {
                System.err.println("Argument must be an integer");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop thread exits
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // wait maximum of second for messageLoop thread to finish
            t.join(1000);
            if ((System.currentTimeMillis() - startTime > patience) && t.isAlive()) {
                threadMessage("Tired of waiting! Interrupting...");
                t.interrupt();
                // should not be long now wait indefinitely
                t.join();
            }
        }
        threadMessage("MessageLoop thread finished");
    }
}
