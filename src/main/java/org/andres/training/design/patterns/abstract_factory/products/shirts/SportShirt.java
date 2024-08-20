package org.andres.training.design.patterns.abstract_factory.products.shirts;

import org.andres.training.design.patterns.abstract_factory.products.Shirt;

public class SportShirt implements Shirt {
    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deeportiva -- Tiene mangas largas? -> No");
        return false;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa deportiva -- Tiene botones? -> No");
        return false;
    }
}
