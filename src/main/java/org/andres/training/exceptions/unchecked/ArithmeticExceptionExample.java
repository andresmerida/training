package org.andres.training.exceptions.unchecked;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a = 5, b = 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
