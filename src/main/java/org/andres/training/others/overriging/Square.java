package org.andres.training.others.overriging;

public class Square extends Figure {
    private final float width;

    public Square(float width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
