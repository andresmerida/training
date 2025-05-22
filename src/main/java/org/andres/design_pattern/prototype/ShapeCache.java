package org.andres.design_pattern.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static final Hashtable<String, Shape> instance = new Hashtable<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape shape = instance.get(shapeId);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        instance.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        instance.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
    }
}
