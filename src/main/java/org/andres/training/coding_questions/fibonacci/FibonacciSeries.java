package org.andres.training.coding_questions.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
 * Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers, commonly denoted Fn .
 * The sequence commonly starts from 0 and 1,
 * although some authors start the sequence from 1 and 1 or sometimes (as did Fibonacci) from 1 and 2.
 * Starting from 0 and 1, the sequence begins[1]
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
 */
public class FibonacciSeries {

    public List<Integer> getFibonacciSeries(int n) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int first = 0, second = 1, next;
        for (int i = 0; i < n; i++) {
            fibonacciSeries.add(first);
            next = first + second;
            first = second;
            second = next;
        }

        return fibonacciSeries;
    }
}
