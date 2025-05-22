package org.andres.design_pattern.factory;

import java.util.Optional;

public class ShapeFactory {
    public static Optional<Shape> getShape(String shapeType) {
        return ShapeType.fromString(shapeType)
                .map(ShapeFactory::createShape);
    }

    private static Shape createShape(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
        };
    }
}
