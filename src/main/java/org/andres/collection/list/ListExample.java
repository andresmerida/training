package org.andres.collection.list;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("Second element: " + list.get(1));

        // set the second element by d value
        list.set(1, "d");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
