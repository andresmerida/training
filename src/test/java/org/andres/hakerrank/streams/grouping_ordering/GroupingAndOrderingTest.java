package org.andres.hakerrank.streams.grouping_ordering;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupingAndOrderingTest {
    private final GroupingAndOrdering groupingAndOrdering = new GroupingAndOrdering();

    @Test
    void getProductsThatBelongMoreThanOneCategory() {
        List<Category> categories = List.of(
                new Category(
                        List.of(
                                new Product("Product 1"),
                                new Product("Product 2"),
                                new Product("Product 3")
                        )
                ),
                new Category(
                        List.of(
                                new Product("Product 1"),
                                new Product("Product 2"),
                                new Product("Product 4")
                        )),
                new Category(
                        List.of(
                                new Product("Product 1"),
                                new Product("Product 5"),
                                new Product("Product 6")
                        )
                )
        );
        List<String> expected = List.of("Product 1", "Product 2");

        assertEquals(expected, groupingAndOrdering.getProductsThatBelongMoreThanOneCategory(categories));
    }
}