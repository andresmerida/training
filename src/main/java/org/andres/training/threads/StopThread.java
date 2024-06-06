package org.andres.training.threads;

public class StopThread extends Thread {
    private volatile Thread stopIndicator;
    @Override
    public void run() {
        Thread thisThread = Thread.currentThread();
        while (thisThread == stopIndicator) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void start() {
        stopIndicator = new Thread(this);
        stopIndicator.start();
    }

    public void stopThread() {
        stopIndicator = null;
    }
}
