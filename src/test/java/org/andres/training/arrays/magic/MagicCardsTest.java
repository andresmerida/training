package org.andres.training.arrays.magic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

class MagicCardsTest {
    private MagicCards magicCards = new MagicCards();

    @Test
    void getMagicCards_perfect_magic() {
        int[] array1 = new int[]{1,3,5};
        int[] array2 = new int[]{2,4,6};

        var result = magicCards.getMagicCards(array1, array2);

        var expected1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        var expected2 = Arrays.asList(2, 1, 4, 3, 6, 5);

        assertTrue(result.equals(expected1) || result.equals(expected2));
    }
}