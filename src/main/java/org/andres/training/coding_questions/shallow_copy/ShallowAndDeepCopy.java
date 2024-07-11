package org.andres.training.coding_questions.shallow_copy;

import java.util.ArrayList;
import java.util.List;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        // crate honda car
        List<String> hondaColors = new ArrayList<>();
        hondaColors.add("red");
        hondaColors.add("blue");
        Car honda = new Car("Honda", hondaColors);

        // deep copy of Honda
        Car deepCopyHonda = new Car(honda.name, new ArrayList<>(hondaColors));
        deepCopyHonda.colors.add("green");
        System.out.print("Deepcopy: ");
        for (String color : deepCopyHonda.colors) {
            System.out.print(color + " ");
        }

        System.out.print("\nOriginal: ");
        for (String color : honda.colors) {
            System.out.print(color + " ");
        }
        System.out.println();
        System.out.println();

        // Shallow Copy of Honda
        Car copyHonda = honda;
        copyHonda.colors.add("green");
        System.out.print("Shallow Copy: ");
        for (String color : copyHonda.colors) {
            System.out.print(color + " ");
        }
        System.out.print("\nOriginal: ");
        for (String color : honda.colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}
