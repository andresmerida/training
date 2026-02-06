package org.andres.hakerrank.stream_profilter.grouping_order_items;

import org.apache.commons.lang3.tuple.Pair;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingOrderItems {

    /**
     * Let’s see how to group the ordered items by category and find the items with minimum and maximum prices in each group
     * Groups the provided list of {@code OrderItem} objects by their {@code OrderItemCategory}
     * and computes the minimum and maximum prices for each category.
     *
     * @param orderItems a list of {@code OrderItem} objects to be grouped by category
     * @return a map where the keys are {@code OrderItemCategory} values and the values are
     *         pairs containing the minimum and maximum prices for each category
     */
    public Map<OrderItemCategory, Pair<Double, Double>> groupByCategoryWithMinMax(List<OrderItem> orderItems) {
        Map<OrderItemCategory, DoubleSummaryStatistics> categoryDoubleSummaryStatisticsMap = orderItems
                .stream()
                .collect(
                        Collectors.groupingBy(
                                OrderItem::category,
                                Collectors.summarizingDouble(OrderItem::price)
                        )
                );
        return categoryDoubleSummaryStatisticsMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> Pair.of(entry.getValue().getMin(), entry.getValue().getMax())));
    }
}
