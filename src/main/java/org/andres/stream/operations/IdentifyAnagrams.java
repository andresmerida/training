package org.andres.stream.operations;

import java.util.*;
import java.util.stream.Collectors;

public class IdentifyAnagrams {

    public Map<String, List<String>> identifyAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            list.add(new String(chars));
        }

        Map<String, List<String>> map = new HashMap<>();
        List<String> anagrams = new ArrayList<>();
        for (String word : list) {
            if (!map.containsKey(word)) {
                anagrams.clear();
            }
            anagrams.add(word);
            map.put(word, anagrams);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<String, List<String>> identifyAnagramsWithStreams(String[] words) {
        Map<String, List<String>> anagramMap = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));
        return anagramMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
