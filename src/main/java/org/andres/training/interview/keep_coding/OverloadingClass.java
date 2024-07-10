package org.andres.training.interview.keep_coding;

public class OverloadingClass {

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2,2, 3));
        System.out.println(add(1,2,3,4));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static String add(int a, int b, int c, int d) {
        return "(a + b + c + d) = " + String.valueOf(a + b + c + d);
    }
}
