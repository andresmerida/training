package org.andres.training.hackerrank.cut_the_sticks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CutTheSticksTest {
    private final CutTheSticks cutTheSticksClass = new CutTheSticks();

    @Test
    void cutTheSticks_exampleInput() {
        var exampleInput = new ArrayList<Integer>();
        exampleInput.add(1);
        exampleInput.add(2);
        exampleInput.add(3);
        List<Integer> result = cutTheSticksClass.cutTheSticks(exampleInput);
        assertEquals(List.of(3,2,1), result);
    }

    @Test
    void cutTheSticks_exampleInput0() {
        var exampleInput0 = new ArrayList<Integer>();
        exampleInput0.add(5);
        exampleInput0.add(4);
        exampleInput0.add(4);
        exampleInput0.add(2);
        exampleInput0.add(2);
        exampleInput0.add(8);
        List<Integer> result = cutTheSticksClass.cutTheSticks(exampleInput0);
        assertEquals(List.of(6,4,2,1), result);
    }

    @Test
    void cutTheSticks_exampleInput1() {
        var exampleInput1List = new ArrayList<Integer>();
        exampleInput1List.add(1);
        exampleInput1List.add(2);
        exampleInput1List.add(3);
        exampleInput1List.add(4);
        exampleInput1List.add(3);
        exampleInput1List.add(3);
        exampleInput1List.add(2);
        exampleInput1List.add(1);
        List<Integer> result = cutTheSticksClass.cutTheSticks(exampleInput1List);
        assertEquals(List.of(8,6,4,1), result);
    }
}