package org.andres.training.recursion;

public class Fibonacci {
    private static long[] seriesFibonacci;
    public static void main(String[] args) {
        int n = 6;
        seriesFibonacci = new long[n+1];
        for (int i=0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (seriesFibonacci[n] != 0) {
            return seriesFibonacci[n];
        }

        long nthFibonacciNumber = fibonacci(n-1) + fibonacci(n-2);
        seriesFibonacci[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
