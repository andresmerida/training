package org.andres.hakerrank.substring_comparisons;

public class SubstringComparison {

    public String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String currentSub = s.substring(i, i + k);
            if (currentSub.compareTo(smallest) < 0) {
                smallest = currentSub;
            }
            if (currentSub.compareTo(largest) > 0) {
                largest = currentSub;
            }
        }
        return smallest + "_" + largest;
    }
}
