package org.andres.hakerrank.streams.grouping_ordering;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndOrdering {

    public List<String> getProductsThatBelongMoreThanOneCategory(List<Category> categories) {
        Map<String, Long> map = categories
                .stream()
                .flatMap(category -> category.products.stream())
                .collect(Collectors.groupingBy(
                        Product::getName,
                        Collectors.counting()
                ));
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();
    }
}
