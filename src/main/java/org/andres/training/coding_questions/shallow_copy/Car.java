package org.andres.training.coding_questions.shallow_copy;

import java.util.List;

public class Car {
    public String name;
    public List<String> colors;

    public Car(String name, List<String> colors) {
        this.name = name;
        this.colors = colors;
    }
}
