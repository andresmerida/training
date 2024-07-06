package org.andres.training.coding_questions.print.odd;

public class Test {
    static int MAX = 5;
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(MAX, printer, false));
        Thread t2 = new Thread(new TaskEvenOdd(MAX, printer, true));
        t1.start();
        t2.start();
    }
}
