package org.andres.training.arrays.sparse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SparseArraysSolution {

    public static void main(String[] args) {
        SparseArraysSolution sparseArraysSolution = new SparseArraysSolution();
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");
        System.out.println("First Solution");
        System.out.println(sparseArraysSolution.matchingStrings(strings, queries));

        System.out.println();

        System.out.println("Second Solution");
        System.out.println(sparseArraysSolution.matchingStringsWithCollectionsUtil(strings, queries));
    }

    public List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        queries.forEach(value -> {
            linkedHashMap.put(value, 0);
        });

        strings.forEach(value -> {
            if (linkedHashMap.containsKey(value)) {
                linkedHashMap.put(value, linkedHashMap.get(value) + 1);
            }
        });

        return new ArrayList<>(linkedHashMap.values());
    }

    public List<Integer> matchingStringsWithCollectionsUtil(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            result.add(Collections.frequency(strings, queries.get(i)));
        }

        return result;
    }
}
