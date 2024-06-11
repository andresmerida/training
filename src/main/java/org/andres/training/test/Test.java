package org.andres.training.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String... args) {
        record Employee(String name, int yearsOfExperince, String birthCity) {
        }

        List<Employee> employees = Stream.of(
                        new Employee("MM", 15, "Cochabamba"),
                        new Employee("SS", 10, "Oruro"),
                        new Employee("MZ", 15, "Santa Cruz"),
                        new Employee("HK", 25, "Cochabamba"))
                .collect(Collectors.toList());
        employees.sort(Comparator.comparing(Employee::yearsOfExperince,
                ((o1, o2) -> { return o2.compareTo(o1); })).thenComparing(Employee::name));
        System.out.println(employees);
    }
}
