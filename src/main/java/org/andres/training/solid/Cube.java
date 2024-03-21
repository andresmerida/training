package org.andres.training.solid;

public class Cube implements Shape, ThreeDimensionalShape {

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double area() {
        return 100;
    }
}
