package org.andres.training.stream.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTerminalOperationsExample {
    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "Sorting", "State");

        // forEach: print each name
        System.out.println("===== print forEach =====");
        names.forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                .filter(name -> name.startsWith("S"))
                .toList();
        System.out.println("\n ==== collect (names starting with 'S') ====");
        sNames.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream()
                .reduce("", (partialString, element) -> partialString + " " + element);
        System.out.println("\n ==== reduce: (concatenated names):");
        System.out.println(concatenatedNames.trim());

        // count: Count the number of names
        System.out.println("\n ==== count: " + names.size());

        // findFirst: Find the first name
        Optional<String> firstName = names.stream().findFirst();
        System.out.println("\n ==== findFirst: ");
        firstName.ifPresent(System.out::println);

        // allMatch: Check if all names start with 'S'
        boolean allStartWithS = names.stream().allMatch(s -> s.startsWith("S"));
        System.out.println("\n ==== allStartWithS: " + allStartWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(s -> s.startsWith("S"));
        System.out.println("\n ==== anyStartWithS: " + anyStartWithS);
    }
}
