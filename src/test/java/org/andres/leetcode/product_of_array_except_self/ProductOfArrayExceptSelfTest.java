package org.andres.leetcode.product_of_array_except_self;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf pr = new ProductOfArrayExceptSelf();

    @Test
    void productExceptSelf() {
        int[] input = {1, 2, 3, 4};
        int[] expectedOutput = {24, 12, 8, 6};

        assertArrayEquals(expectedOutput, pr.productExceptSelf(input));
    }

    @Test
    void productExceptSelf_example2() {
        int[] input = {-1,1,0,-3,3};
        int[] expectedOutput = {0,0,9,0,0};

        assertArrayEquals(expectedOutput, pr.productExceptSelf(input));
    }

    @Test
    void productExceptSelf_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> pr.productExceptSelf(null));
    }

    @Test
    void productExceptSelf_throwsIllegalArgumentException_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> pr.productExceptSelf(new int[0]));
    }

    @Test
    void productExceptSelf_throwsIllegalArgumentException_overLengthArray() {
        int[] input = {1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
        assertThrows(IllegalArgumentException.class, () -> pr.productExceptSelf(input));
    }
}