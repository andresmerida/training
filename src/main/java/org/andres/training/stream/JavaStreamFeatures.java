package org.andres.training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamFeatures {
    public static void main(String[] args) {
        ofNullable();
        streamIterate();
        collectorsCollectingAndThen();
        streamTakeWhileAndDropWhile();
        collectorsTeeing();
        streamConcat();
        collectorsPartitioningBy();
        intStreamRange();
    }

    /**
     * IntStream.range
     */
    private static void intStreamRange() {
        System.out.println();
        System.out.println("======= intStreamRange =======");
        List<Integer> intStream = IntStream.range(1,20).boxed().toList();
        System.out.println(intStream);
        List<Integer> intStream2 = IntStream.rangeClosed(1,20).boxed().toList();
        System.out.println(intStream2);
    }

    /**
     * Collectors.partitioningBy
     */
    private static void collectorsPartitioningBy() {
        System.out.println();
        System.out.println("======= Collectors.partitioningBy() =======");
        List<Integer> numbers = List.of(1,2,3,4,6,7,8,9);

        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(map);
    }

    /**
     * Stream.concat()
     */
    private static void streamConcat() {
        System.out.println();
        System.out.println("======== Stream.concat ========");

        Stream<Integer> stream1 = Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(4,5,6);
        Stream<Integer> concatStream = Stream.concat(stream1, stream2);

        var sum = concatStream.mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    /**
     * Collectors.teeing()
     */
    private static void collectorsTeeing() {
        System.out.println();
        System.out.println("======= Collectors.teeing() =======");
        List<Integer> numbers = List.of(1,2,3,4,6,7,8,9);

        var minMaxMap = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.minBy(Integer::compareTo),
                        Collectors.maxBy(Integer::compareTo),
                        (o1, o2) -> Map.of("Min", o1.get(), "Max", o2.get())
                ));
        System.out.println(minMaxMap);
    }

    /**
     * Stream.takenWhile and Stream.dropWhile
     */
    private static void streamTakeWhileAndDropWhile() {
        System.out.println();
        System.out.println("========= Stream.takenWhile and Stream.dropWhile =======");
        List<Integer> numbers = List.of(1,2,3,4,6,7,8,9);
        var result = numbers.stream()
                .takeWhile(num -> num < 5)
                .toList();
        System.out.println(result);

        var result2 = numbers.stream()
                .dropWhile(num -> num < 5)
                .toList();
        System.out.println(result2);
    }

    /**
     * Calculate avg salary & round up to nearest integer
     * Collectors.collectingAndThen
     */
    private static void collectorsCollectingAndThen() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000.0),
                new Employee("Bob", 65000.0),
                new Employee("Charlie", 78000.0),
                new Employee("Sarah", 45000.0));

        long avg = employees.stream()
                .mapToDouble(Employee::salary)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingDouble(Double::doubleValue),
                        Math::round
                ));
        System.out.println();
        System.out.println("======= Collectors.collectingAndThen ========== ");
        System.out.println(avg);
    }

    /**
     * Stream.iterate
     * Result expected: 0, 2, 4, 6, 8
     */
    private static void streamIterate() {
        System.out.println();
        System.out.println("========== Stream.iterate ========");
        Stream.iterate(0, n -> n+2)
                .limit(5)
                .forEach(System.out::println);
    }

    /**
     * Stream.ofNullable
     */
    private static void ofNullable() {
        List<String> names = Arrays.asList("Basant", "Santosh", null, "Vinod", null, "Sam", "John");

        List<String> newList = names.stream()
                .filter(Objects::nonNull)
                .toList();
        System.out.println(newList);

        List<String> otherOptionList = names.stream()
                .flatMap(Stream::ofNullable)
                .toList();
        System.out.println(otherOptionList);
    }

    public record Employee(String name, Double salary) {}
    
}
