package org.andres.training.solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += (int) shapes.get(i).area();
        }
        return sum;
    }
}
