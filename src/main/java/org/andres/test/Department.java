package org.andres.test;

import java.util.HashMap;
import java.util.Map;

public class Department {
    Map<Student, Integer> studentIntegerMap;

    public Department() {
        this.studentIntegerMap = new HashMap<>();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Andres", "Merida");
        Student student2 = new Student("Juan", "Peres");
        Student student3 = new Student("Jose", "Merida");

        Department department = new Department();
        department.add(student1, 10);
        department.add(student2, 11);
        department.add(student3, 9);
        department.printStudents();
    }

    public void printStudents() {
        for (Map.Entry<Student, Integer> entry : studentIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void add(Student student, Integer mark) {
        studentIntegerMap.put(student, mark);
    }
    // just adding a comment for test
}
