package org.andres.training.coding_questions.number_of_words;

public class NumberOfWords {

    public int numberOfWords(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty String");
        }

        return s.split(" ").length;
    }

    public int numberOfWords2(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty String");
        }

        int counter = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                counter++;
            }
        }

        return counter;
    }
}
