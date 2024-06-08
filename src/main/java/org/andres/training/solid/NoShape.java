package org.andres.training.solid;

public class NoShape implements Shape {
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate an area");
    }
}
