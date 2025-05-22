package org.andres.design_pattern.factory;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    /**
     * This class tests the `ShapeFactory` class and its `getShape` method.
     * The `getShape` method is expected to return an Optional containing a specific implementation
     * of the `Shape` interface (Circle, Rectangle, or Square) based on the provided shape type string.
     * If the string doesn't match any supported shape type, an empty Optional is returned.
     */

    @Test
    void shouldReturnCircleWhenShapeTypeIsCircle() {
        // Act
        Optional<Shape> result = ShapeFactory.getShape("CIRCLE");

        // Assert
        assertTrue(result.isPresent());
        assertInstanceOf(Circle.class, result.get());
    }

    @Test
    void shouldReturnRectangleWhenShapeTypeIsRectangle() {
        // Act
        Optional<Shape> result = ShapeFactory.getShape("RECTANGLE");

        // Assert
        assertTrue(result.isPresent());
        assertInstanceOf(Rectangle.class, result.get());
    }

    @Test
    void shouldReturnSquareWhenShapeTypeIsSquare() {
        // Act
        Optional<Shape> result = ShapeFactory.getShape("SQUARE");

        // Assert
        assertTrue(result.isPresent());
        assertInstanceOf(Square.class, result.get());
    }

    @Test
    void shouldReturnEmptyOptionalWhenShapeTypeIsInvalid() {
        // Act
        Optional<Shape> result = ShapeFactory.getShape("INVALID_TYPE");

        // Assert
        assertFalse(result.isPresent());
    }

    @Test
    void shouldReturnEmptyOptionalWhenShapeTypeIsNull() {
        // Act
        Optional<Shape> result = ShapeFactory.getShape(null);

        // Assert
        assertFalse(result.isPresent());
    }
}