package org.andres.coderbyte;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Longest word in a sentence
 */
public class LongestWord {

    public String getLongestWordWithIterating(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Argument is blank");
        }
        String[] words = str.split(" ");
        int longestWord = 0;
        String longestWordStr = "";

        for (String word : words) {
            if (word.length() > longestWord) {
                longestWord = word.length();
                longestWordStr = word;
            }
        }

        return longestWordStr;
    }

    public String getLongestWordWithStreams(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Argument is blank");
        }

        return Arrays
                .stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
