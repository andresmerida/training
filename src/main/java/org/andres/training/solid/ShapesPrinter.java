package org.andres.training.solid;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String toJson(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(
                areaCalculator.sum(shapes)
        );
    }

    public String toCsv(List<Shape> shapes) {
        return "shapes_sum,%s".formatted(
                areaCalculator.sum(shapes)
        );
    }
}
