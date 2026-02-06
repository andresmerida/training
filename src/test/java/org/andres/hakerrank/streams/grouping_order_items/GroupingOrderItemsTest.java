package org.andres.hakerrank.streams.grouping_order_items;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GroupingOrderItemsTest {
    private final GroupingOrderItems groupingOrderItems = new GroupingOrderItems();

    @Test
    void whenOrderItemsAreGrouped_thenGetsMinMaxPerGroup() {
        List<OrderItem> items =
                Arrays.asList(
                        new OrderItem(1L, 1299.99, OrderItemCategory.ELECTRONICS),
                        new OrderItem(2L, 1199.99, OrderItemCategory.ELECTRONICS),
                        new OrderItem(3L, 2199.99, OrderItemCategory.ELECTRONICS),
                        new OrderItem(4L, 220.00, OrderItemCategory.FURNITURE),
                        new OrderItem(4L, 200.20, OrderItemCategory.FURNITURE),
                        new OrderItem(5L, 215.00, OrderItemCategory.FURNITURE),
                        new OrderItem(6L, 50.75, OrderItemCategory.CLOTHING),
                        new OrderItem(7L, 75.00, OrderItemCategory.CLOTHING),
                        new OrderItem(8L, 75.00, OrderItemCategory.CLOTHING));
        Map<OrderItemCategory, Pair<Double, Double>> result = groupingOrderItems.groupByCategoryWithMinMax(items);

        assertEquals(Pair.of(1199.99, 2199.99), result.get(OrderItemCategory.ELECTRONICS));
        assertEquals(Pair.of(200.20, 220.00), result.get(OrderItemCategory.FURNITURE));
        assertEquals(Pair.of(50.75, 75.00), result.get(OrderItemCategory.CLOTHING));
    }
}