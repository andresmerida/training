package org.andres.stream.shortest;

import java.util.List;

public class AverageLengthWord {

    public double averageLength(String[] words) {
        int sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        return (double) sum / words.length;
    }

    public double averageLengthSolution(List<String> words) {
        return words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0.0d);
    }
}
