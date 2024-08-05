package org.andres.training.coding_questions.permutations_string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsStringTest {
    private final PermutationsString permutationsString = new PermutationsString();

    @Test
    void permutationsString_should_return_sixCombinations() {
        var result = permutationsString.permutationsString("ABC");

        var resultExpected = new ArrayList<String>();
        resultExpected.add("ABC");
        resultExpected.add("ACB");
        resultExpected.add("BAC");
        resultExpected.add("BCA");
        resultExpected.add("CAB");
        resultExpected.add("CBA");

        Collections.sort(result);
        Collections.sort(resultExpected);

        assertEquals(resultExpected, result);
    }

    @Test
    void permutationsString_should_return_twoCombinations() {
        var result = permutationsString.permutationsString("AB");

        var resultExpected = new ArrayList<String>();
        resultExpected.add("AB");
        resultExpected.add("BA");

        Collections.sort(result);
        Collections.sort(resultExpected);
        assertEquals(resultExpected, result);
    }
}