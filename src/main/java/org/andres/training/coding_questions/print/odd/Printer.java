package org.andres.training.coding_questions.print.odd;

public class Printer {
    boolean isOdd = false;
    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Even: " + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Odd: " + number);
        isOdd = true;
        notifyAll();
    }
}
