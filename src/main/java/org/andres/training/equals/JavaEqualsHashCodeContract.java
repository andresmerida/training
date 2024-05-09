package org.andres.training.equals;

import java.util.HashSet;
import java.util.Set;

public class JavaEqualsHashCodeContract {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alex", 2000.0);
        Employee e2 = new Employee("Alex", 2000.0);

        System.out.println(e1.equals(e2));

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set);

        System.out.println("Employee 1 hashcode: " + e1.hashCode());
        System.out.println("Employee 2 hashcode: " + e2.hashCode());
    }
}
