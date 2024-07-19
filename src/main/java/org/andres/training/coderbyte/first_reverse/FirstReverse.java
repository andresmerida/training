package org.andres.training.coderbyte.first_reverse;

public class FirstReverse {

    public String firstReverse(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
