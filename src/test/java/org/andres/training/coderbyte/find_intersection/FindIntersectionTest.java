package org.andres.training.coderbyte.find_intersection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntersectionTest {
    FindIntersection findIntersection = new FindIntersection();

    @Test
    void findIntersection_example1() {
        String result = findIntersection.findIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"});
        assertEquals("1, 4, 13", result);
    }

    @Test
    void findIntersection_example2() {
        String result = findIntersection.findIntersection(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"});
        assertEquals("1, 9, 10", result);
    }

    @Test
    void findIntersection_return_false() {
        String result = findIntersection.findIntersection(new String[] {"1, 3, 9, 10, 17, 18", "20, 21, 22, 23"});
        assertEquals("false", result);
    }
}