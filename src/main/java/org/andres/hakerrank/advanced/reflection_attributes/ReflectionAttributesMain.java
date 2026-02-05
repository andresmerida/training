package org.andres.hakerrank.advanced.reflection_attributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionAttributesMain {
    static void main() {
        // get the class object for Student
        Class<?> studentClass = Student.class;

        // Get all declared methods
        Method[] methods = studentClass.getDeclaredMethods();

        // Extract names into a list for sorting
        List<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        // Sort the names alphabetically
        methodNames.sort(String::compareTo);

        // Print the sorted list
        methodNames.forEach(System.out::println);
    }
}
