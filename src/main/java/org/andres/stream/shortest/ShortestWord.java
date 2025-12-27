package org.andres.stream.shortest;

import java.util.List;

/**
 * Find the shortest word in a list of words
 */
public class ShortestWord {

    public String findShortestWord(String[] words) {
        String shortestWord = words[0];
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }

    public String findShortestWord(List<String> words) {
        return words.stream()
                .reduce((a, b) -> a.length() < b.length() ? a : b)
                .orElse("");
    }
}
