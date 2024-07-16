package org.andres.training.hackerrank.non_divisible_subset;

import java.util.List;

public class NonDivisibleSubset {

    public int nonDivisibleSubset(int k, List<Integer> s) {
        if (k < 1 || k > 100) {
            throw new IllegalArgumentException("Invalid k: " + k);
        }

        int[] remainderCounts = new int[k];
        int count = 0;

        for (int i : s) {
            remainderCounts[i % k]++;
        }

        for (int j = 1; j <= (k / 2); j++) {
            if (j == k - j) {
                count++;
                continue;
            }
            count += Math.max(remainderCounts[j], remainderCounts[k - j]);
        }

        if (remainderCounts[0] > 0) {
            count++;
        }

        return count;
    }
}
