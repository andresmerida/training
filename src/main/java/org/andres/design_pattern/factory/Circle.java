package org.andres.design_pattern.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle, Inside Circle class.");
    }
}
