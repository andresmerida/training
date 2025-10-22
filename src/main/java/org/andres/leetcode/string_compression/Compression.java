package org.andres.leetcode.string_compression;

public class Compression {

    public int compress(char[] chars) {
        if (chars.length < 1 || chars.length > 2000) {
            throw new IllegalArgumentException("invalid array length");
        }

        StringBuilder sbRes = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int counter = 0;
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                counter++;
            }
            sbRes.append(currentChar);
            if (counter != 1) {
                sbRes.append(counter);
            }
        }

        return sbRes.length();
    }
}
