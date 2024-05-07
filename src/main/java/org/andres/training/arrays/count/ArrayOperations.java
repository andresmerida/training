package org.andres.training.arrays.count;

import java.util.HashMap;
import java.util.Map;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {1,4,4,5,4};
        int[] numbers2 = {1,5,4,4,4};

        if (getMapValues(numbers).equals(getMapValues(numbers2))) {
            System.out.println("Map Equals");
        } else {
            System.out.println("Not equals");
        }
    }

    static Map<Integer, Integer> getMapValues(int[] numbers) {
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int number : numbers) {
            if (numbersMap.containsKey(number)) {
                numbersMap.put(number, numbersMap.get(number) + 1);
            } else {
                numbersMap.put(number, 1);
            }
        }

        return numbersMap;
    }
}
