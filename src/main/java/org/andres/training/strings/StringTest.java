package org.andres.training.strings;

import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("one", 1);
        maps.put("two", 2);
        maps.put(null, 1);
    }
}
