package org.andres.training.hackerrank.utopian_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtopianTreeTest {
    private UtopianTree utopianTree;

    @BeforeEach
    void setUp() {
        utopianTree = new UtopianTree();
    }

    @Test
    void utopianTree_HeightForFourCycles() {
        int result = utopianTree.utopianTree(4);

        assertEquals(7, result);
    }

    @Test
    void utopianTree_HeightForZeroCycles() {
        int result = utopianTree.utopianTree(0);

        assertEquals(1, result);
    }

    @Test
    void utopianTree_IllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utopianTree.utopianTree(-1);
        });

        assertTrue(exception.getMessage().contains("n must be between 0 and 60"));
    }
}