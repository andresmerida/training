package org.andres.training.design.patterns.abstract_factory.factories;

import org.andres.training.design.patterns.abstract_factory.ClothesFactory;
import org.andres.training.design.patterns.abstract_factory.products.Shirt;
import org.andres.training.design.patterns.abstract_factory.products.Shoe;
import org.andres.training.design.patterns.abstract_factory.products.Trousers;
import org.andres.training.design.patterns.abstract_factory.products.shirts.GalaShirt;
import org.andres.training.design.patterns.abstract_factory.products.shoes.GalaShoe;
import org.andres.training.design.patterns.abstract_factory.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {
    @Override
    public Shoe createShoe() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new GalaTrousers();
    }
}
