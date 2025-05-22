package org.andres.design_pattern.factory;

import java.util.Optional;

public enum ShapeType {
    CIRCLE, RECTANGLE, SQUARE;

    public static Optional<ShapeType> fromString(String shapeType) {
        if (shapeType == null) {
            return Optional.empty();
        }
        try {
            return Optional.of(valueOf(shapeType.toUpperCase()));
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
