package org.andres.design_pattern.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle, Inside Rectangle class.");
    }
}
