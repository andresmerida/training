package org.andres.training.design.patterns.abstract_factory.factories;

import org.andres.training.design.patterns.abstract_factory.ClothesFactory;
import org.andres.training.design.patterns.abstract_factory.products.Shirt;
import org.andres.training.design.patterns.abstract_factory.products.Shoe;
import org.andres.training.design.patterns.abstract_factory.products.Trousers;
import org.andres.training.design.patterns.abstract_factory.products.shirts.SportShirt;
import org.andres.training.design.patterns.abstract_factory.products.shoes.SportShoe;
import org.andres.training.design.patterns.abstract_factory.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {
    @Override
    public Shoe createShoe() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}
