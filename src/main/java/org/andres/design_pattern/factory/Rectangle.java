package org.andres.design_pattern.factory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle, Inside Rectangle class.");
    }
}
