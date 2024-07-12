package org.andres.training.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public List<Long> getMiniMaxSum(List<Long> arr) {
        List<Long> miniMaxSumList = new ArrayList<>();
        arr.sort(Long::compareTo);

        long miniSum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            miniSum += arr.get(i);
        }

        long maxSum = 0;
        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }
        miniMaxSumList.add(miniSum);
        miniMaxSumList.add(maxSum);

        return miniMaxSumList;
    }
}
