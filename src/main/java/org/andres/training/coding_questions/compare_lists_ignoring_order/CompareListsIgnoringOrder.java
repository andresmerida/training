package org.andres.training.coding_questions.compare_lists_ignoring_order;

import java.util.List;

public class CompareListsIgnoringOrder {

    public boolean compare(List<?> list1, List<?> list2) {
        if (list1 == null || list2 == null) return false;
        if (list1.size() != list2.size()) return false;

        for (Object o1 : list1) {
            list2.remove(o1);
        }

        return list2.isEmpty();
    }
}
