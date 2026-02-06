package org.andres.hakerrank.streams.grouping_ordering;

import java.util.List;

public class Category {
    List<Product> products;

    public Category(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
