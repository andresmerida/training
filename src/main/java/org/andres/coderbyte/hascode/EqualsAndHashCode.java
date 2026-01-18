package org.andres.coderbyte.hascode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualsAndHashCode {
    void main() {
        Person person1 = new Person(
                1L,
                "5923853",
                "Andres Merida",
                "797245571"
        );
        Person person2 = new Person(
                1L,
                "5923853",
                "Andres Merida",
                "797245572"
        );
        Person person3 = new Person(
                1L,
                "5923853",
                "Andres Merida",
                "797245573"
        );

        Map<Person, String> map = new HashMap<>();
        map.put(person1, "Andres1");
        map.put(person2, "Andres2");
        map.put(person3, "Andres3");

        Set<Person> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);

        IO.println("HasMap: " + map);
        IO.println("HashSet: " + hashSet);
    }
}
