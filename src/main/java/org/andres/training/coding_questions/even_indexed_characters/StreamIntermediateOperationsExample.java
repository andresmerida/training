package org.andres.training.coding_questions.even_indexed_characters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        // list of lists of names
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"));

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> result = listOfList.stream()
                .flatMap(List::stream)  // Flatten the list into a single stream
                .filter(s -> s.startsWith("S")) // Filter elements starting with "S"
                .map(String::toUpperCase)   // Transform each element to uppercase
                .distinct() // Remove duplicate elements
                .sorted()   // Sort elements
                .peek(intermediateResults::add) // Perform an action (add to set) on each element
                .toList();  // Collect the final result into a list

        // print the intermediate results
        System.out.println("===== Intermediate results: ======");
        intermediateResults.forEach(System.out::println);

        // print the final result
        System.out.println();
        System.out.println("==== Final Result =====");
        result.forEach(System.out::println);
    }
}
