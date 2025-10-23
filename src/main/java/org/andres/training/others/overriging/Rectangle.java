package org.andres.training.others.overriging;

public class Rectangle extends Figure{
    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double getArea() {
        return width * height;
    }
}
