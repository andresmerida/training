package org.andres.design_pattern.prototype;

public class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle, Inside Circle class.");
    }
}
