package org.andres.leetcode.group_anagrams;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    private final GroupAnagrams g = new GroupAnagrams();

    @Test
    public void groupAnagramsTest() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = List.of(List.of("bat"), List.of("tan","nat"), List.of("eat","tea","ate"));

        assertEquals(expected, g.groupAnagrams(input));
    }

    @Test
    public void groupAnagramsTest_example2() {
        String[] input = {""};

        assertThrows(IllegalArgumentException.class, () -> g.groupAnagrams(input));
    }

    @Test
    public void groupAnagramsTest_example3() {
        String[] input = {"a"};
        List<List<String>> expected = List.of(List.of("a"));

        assertEquals(expected, g.groupAnagrams(input));
    }

    @Test
    public void groupAnagramsTest_throwIllegalArgumentException_null() {
        String[] input = {"Eat","TEA","tan","ate","nat","bat"};
        assertThrows(IllegalArgumentException.class, () -> g.groupAnagrams(input));
    }

    @Test
    public void groupAnagramsTest_empty() {
        assertEquals(Collections.emptyList(), g.groupAnagrams(new  String[0]));
    }
}