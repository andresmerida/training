package org.andres.hakerrank.challenges;

import java.util.List;

public class DivisibleSumPairs {

    public int divisibleSumPairs(int k, List<Integer> ar) {
        if (k < 1 || k > 100) {
            throw new IllegalArgumentException("k should be between 1 and 100");
        }

        int counter = 0;
        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public int divisibleSumPairsEfficient(int k, List<Integer> ar) {
        if (k < 1 || k > 100) {
            throw new IllegalArgumentException("k should be between 1 and 100");
        }

        int count = 0;
        int[] remainderFrequencies = new int[k];

        for (int num : ar) {
            int remainder = num % k;
            int complement = (remainder == 0) ? 0 : k - remainder;
            count += remainderFrequencies[complement];
            remainderFrequencies[remainder]++;
        }

        return count;
    }
}
