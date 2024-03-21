package org.andres.training.stream;

import java.util.ArrayList;
import java.util.List;

public class TraditionalForLoopExample {
    public static void main(String[] args) {
        // Get people greater or equal to 18 year old and convert to uppercase
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 17));
        people.add(new Person("Charlie", 30));
        people.add(new Person("David", 15));

        printAdultNamesInUpperCase(people);

        List<String> adultNamesInUpperCase = new ArrayList<>();
        for (Person person : people) {
            if (person.age() >= 18) {
                adultNamesInUpperCase.add(person.name().toUpperCase());
            }
        }

        for (String name : adultNamesInUpperCase) {
            System.out.println(name);
        }
    }

    public static void printAdultNamesInUpperCase(List<Person> people) {
        List<String> adultNamesInUpperCase = people.stream()
                .filter(person -> person.age() >= 18)
                .map(person -> person.name().toUpperCase())
                .toList();
        adultNamesInUpperCase.forEach(System.out::println);
    }
}

record Person(String name, Integer age) {}

