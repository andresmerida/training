package org.andres.test;

import java.util.stream.Stream;

public class Deer {
    public Deer() {
        System.out.println("Deer");
    }

    public Deer(int age) {
        System.out.println("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", s -> s + "1");
        System.out.println(stream.limit(2).map(s -> s + "2"));
        System.out.println(stream.limit(2).map(s -> s + "3"));
    }
}
