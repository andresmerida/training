package org.andres.training.coding_questions.duplicate_words;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {
        String input = "Big black bug bit a big black dog on his big black nose";
        System.out.println("Duplicate words in a given string: ");
        duplicateWord(input);
    }

    public static void duplicateWord(String input) {
        String[] inputLowerCaseArray = input.toLowerCase().split(" ");
        Map<String, Integer> mapWords = new HashMap<>();
        for (String word : inputLowerCaseArray) {
            if (mapWords.containsKey(word)) {
                mapWords.put(word, mapWords.get(word) + 1);
            } else {
                mapWords.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapWords.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
