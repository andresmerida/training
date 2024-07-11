package org.andres.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRank {
    public static void main(String[] args) {
        int k = 3;
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(300);
        list.add(200);
        list.add(1000);
        list.add(20);
        list.add(30);
        System.out.println(maxMin(k, list));
    }

    public static int maxMin(int k, List<Integer> list) {
        Collections.sort(list);
        int ans = Integer.MAX_VALUE;
        for (int i = k-1 ; i < list.size(); i++) {
            ans = Math.min(ans, list.get(i) - list.get(i - k + 1));
        }

        return ans;
    }
}

