package org.andres.hakerrank.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreamProfilterExampleTest {
    private final StreamProfilterExample streamProfilterExample = new StreamProfilterExample();

    @Test
    void getDuplicateOfFruits() {
        List<String> fruits = List.of("Apple", "Banana", "Apple", "Orange", "Banana", "Apple");
        List<String> expected = List.of("Apple", "Banana");
        assertEquals(expected, streamProfilterExample.getDuplicateOfFruits(fruits));
    }

    @Test
    void getDuplicateOfFruits_empty() {
        assertThrows(IllegalArgumentException.class, () -> streamProfilterExample.getDuplicateOfFruits(List.of()));
    }

    @Test
    void getDuplicateOfFruits_null() {
        assertThrows(IllegalArgumentException.class, () -> streamProfilterExample.getDuplicateOfFruits(null));
    }

    @Test
    void getDuplicatesOfIntegers() {
        Integer[] input = {1, 2, 3, 4, 2, 7, 8, 8, 3, 2, 1};
        List<Integer> expected = Arrays.asList(1, 2, 3, 8);
        assertEquals(expected, streamProfilterExample.getDuplicatesOfIntegers(input));
    }

    @Test
    void getTotalSalesGreaterThan150ByCategory() {
        List<Sale> sales = Arrays.asList(
                new Sale("Electronics", 150.00),
                new Sale("Clothing", 75.50),
                new Sale("Electronics", 200.00),
                new Sale("Clothing", 30.00),
                new Sale("Books", 12.99)
        );
        Map<String, Double> expected = Map.of("Electronics", 350.0);
        assertEquals(expected, streamProfilterExample.getTotalSalesGreaterThan150ByCategory(sales));
    }

    @Test
    void getTotalSalesGreaterThan150ByCategory_null() {
        assertThrows(IllegalArgumentException.class, () -> streamProfilterExample.getTotalSalesGreaterThan150ByCategory(null));
    }
}