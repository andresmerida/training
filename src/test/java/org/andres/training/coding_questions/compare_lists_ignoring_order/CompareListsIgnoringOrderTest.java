package org.andres.training.coding_questions.compare_lists_ignoring_order;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareListsIgnoringOrderTest {
    private final CompareListsIgnoringOrder compareListsIgnoringOrder;

    CompareListsIgnoringOrderTest() {
        this.compareListsIgnoringOrder = new CompareListsIgnoringOrder();
    }

    @Test
    void compareListsIgnoringOrder_shouldReturnTrue() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(5, 4, 3, 2, 1));

        assertTrue(compareListsIgnoringOrder.compare(list1, list2));
    }

    @Test
    void compareListsIgnoringOrder_shouldReturnFalse() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(5, 4, 3, 2, 6));

        assertFalse(compareListsIgnoringOrder.compare(list1, list2));
    }

    @Test
    void compareListsIgnoringOrder_nullValue() {
        List<Integer> list1 = null;
        List<Integer> list2 = List.of(5, 4, 3, 2, 6);

        assertFalse(compareListsIgnoringOrder.compare(list1, list2));
    }

    @Test
    void compareListsIgnoringOrder_shouldReturnFalse_DifferentSize() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(5, 4, 3, 2, 1, 0);

        assertFalse(compareListsIgnoringOrder.compare(list1, list2));
    }
}