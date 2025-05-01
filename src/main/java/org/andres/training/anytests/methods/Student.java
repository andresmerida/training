package org.andres.training.anytests.methods;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printStudent(String header) {
        System.out.println(header);
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
