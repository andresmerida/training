package org.andres.training.hackerrank.sherlock_and_squares;

import java.util.List;

public class SherlockAndSquares {
    final List<Integer> perfectSquaresValues = List.of(1,4,5,6,9,0);

    public int squares(int a, int b) {
        return (int)Math.sqrt(b) - (int)Math.ceil(Math.sqrt(a)) + 1;
    }
}
