package org.andres.training.hackerrank.triplets;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> tripletsA = List.of(17,28,30);
        List<Integer> tripletsB = List.of(99,16,8);
        System.out.println(compareTriplets(tripletsA, tripletsB));
    }

    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int aliceScore  = 0, bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (b.get(i) > a.get(i)) {
                bobScore++;
            }
        }

        result.add(aliceScore);
        result.add(bobScore);
        return result;
    }
}
