package org.andres.hakerrank.streams.flat_map;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FlatOperationsTest {
    private final FlatOperations flatOperations = new FlatOperations();

    @Test
    void getAListFromListOfList() {
        List<List<String>> input = List.of(List.of("Java", "Spring"),
                List.of("Python", "Django"),
                List.of("SQL", "NoSQL"));
        List<String> expected = List.of("Java", "Spring", "Python", "Django", "SQL", "NoSQL");
        assertEquals(expected, flatOperations.getAListFromListOfList(input));
    }

    @Test
    void getAllDevSkills() {
        List<Developer> devs = List.of(new Developer(1, "Andres", List.of("Java", "Spring Boot", "Microservices")),
                new Developer(2, "Juan", List.of("Java", "Spring Boot", "Python", "Django", "REST API")),
                new Developer(3, "Maria", List.of("Java", "SQL", "NoSQL")));
        List<String> expected = List.of("Java", "Spring Boot", "Microservices", "Python", "Django", "REST API", "SQL", "NoSQL");
        assertEquals(expected, flatOperations.getAllDevSkills(devs));
    }

    @Test
    void getAllDevSkills_null() {
        assertThrows(IllegalArgumentException.class, () -> flatOperations.getAllDevSkills(null));
    }

    @Test
    void getOptionalString() {
        Optional<String> input = Optional.of("Java");
        assertEquals("JAVA", flatOperations.getOptionalString(input).get());
    }
}