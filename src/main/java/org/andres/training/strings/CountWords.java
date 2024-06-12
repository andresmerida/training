package org.andres.training.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * "This thiS is is done by Programmer Programmer"
 * Expected output:{Programmer=2, by=1, thiS=1, This=1, is=2, done=1}
 */
public class CountWords {
    public static void main(String[] args) {
        String input = "This thiS is is done by Programmer Programmer";
        System.out.println(countWords(input));
    }

    private static String countWords(String input) {
        String[] words = input.split(" ");
        Map<String, Integer> mapCountWords = new HashMap<>();
        for (String value : words) {
            if (mapCountWords.containsKey(value)) {
                mapCountWords.put(value, mapCountWords.get(value) + 1);
            } else {
                mapCountWords.put(value, 1);
            }
        }

        return mapCountWords.toString();
    }
}
