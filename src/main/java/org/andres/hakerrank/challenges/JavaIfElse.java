package org.andres.hakerrank.challenges;

public class JavaIfElse {

    public String isWeird(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("n should be between 1 and 100");
        }

        if (n % 2 != 0) {
            return "Weird";
        } else if (n < 6) {
            return "Not Weird";
        } else if (n < 21) {
            return "Weird";
        } else {
            return "Not Weird";
        }
    }
}
