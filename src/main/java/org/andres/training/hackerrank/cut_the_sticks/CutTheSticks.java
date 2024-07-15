package org.andres.training.hackerrank.cut_the_sticks;

import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {
        var list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        var list2 = new ArrayList<>(list1);
        list1.remove(2);

        System.out.println(list2);
    }

    public List<Integer> cutTheSticks(List<Integer> arr) {
        var lengthOfCutList = new ArrayList<Integer>();

        arr.sort(Integer::compare);
        int min = arr.get(0);
        lengthOfCutList.add(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > min) {
                min = arr.get(i);
                lengthOfCutList.add(arr.size() - i);
            }
        }

        return lengthOfCutList;
    }
}
