package org.andres.training.others;

import java.util.HashMap;
import java.util.Map;

public class SwapTwoNumbers {

    public void swap(int a, int b) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", a);
        map.put("b", b);
        System.out.println(map.toString());

        a = a + b;
        b = a - b;
        a = a - b;

        map.put("a", a);
        map.put("b", b);
        System.out.println(map.toString());
    }

    public static void main(String[] args) {
        SwapTwoNumbers swap = new SwapTwoNumbers();
        swap.swap(9, 5);
    }
}
