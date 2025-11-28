package org.andres.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        // 1.   From a Collection
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream1 = list.stream();

        // 2.   From an array
        String[] array = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(array);

        // 3.   Using Stream.of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);

        // 4.   Infinite Stream (limit to avoid infinite loop)
        Stream<Integer> stream4 = Stream
                .iterate(1, x -> x + 1)
                .limit(5);
        stream4.forEach(System.out::println);

        System.out.println();
        // some common intermediate operators filter(), map(), Sorted(), Distinct(), Skip()
        List<Integer> numbers = Arrays.asList(5, 10, 10, 20, 30, 40, 40);

        numbers.stream()
                .filter(n -> n > 10)        // keep > 10
                .map(n -> n * 2)            // double them
                .distinct()                         // remove duplicates
                .sorted()                           // sort ascending
                .forEach(System.out::println);      // result

        // remove duplicates
        List<String> names = Arrays.asList("Amit", "Riya", "Rohan", "Amit");
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

        System.out.println();
        // Count names starting with 'R'
        long count = names.stream()
                .filter(n -> n.startsWith("R"))
                .count();
        System.out.println("Names staring with R: " + count);

        // Reduce (concatenate names)
        String result = names.stream()
                .reduce("", (a, b) -> a + b + " ");
        System.out.println(result);

        System.out.println();

        // Parallel Stream
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22);
        numbers1.parallelStream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println();
        // Primitive Streams
        IntStream
                .range(1, 5)
                .forEach(System.out::println);

        LongStream
                .iterate(1, x -> x + 1)
                .limit(10)
                .forEach(System.out::println);

        List<InnerTransaction> transactions = Arrays.asList(
                new InnerTransaction(1, 100, "GROCERY"),
                new InnerTransaction(3, 80, "GROCERY"),
                new InnerTransaction(6, 120, "GROCERY"),
                new InnerTransaction(7, 40, "ELECTRONICS"),
                new InnerTransaction(10, 50, "GROCERY")
        );

        List<Integer> transactionsIds = transactions.stream()
                .filter(t -> t.type().equals("GROCERY"))
                .sorted(Comparator.comparing(InnerTransaction::value).reversed())
                .map(InnerTransaction::id)
                .toList();
        System.out.println(transactionsIds);

        Map<String, Integer> mapExample = Map.of("Andres", 6, "Ana", 3);
        System.out.println(mapExample);
    }

    record InnerTransaction(int id, int value, String type) {
    }
}
