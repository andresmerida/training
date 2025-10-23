package org.andres.training.others;

public class FibonacciSeries {

    public int[] generateFibonacciSeries(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n should be > 0");
        }

        if (n == 1) {
            return new int[] {0};
        }
        if (n == 2) {
            return new int[] {0,1};
        }

        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        return fibonacciSeries;
    }
}
