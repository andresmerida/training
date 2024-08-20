package org.andres.training.design.patterns.abstract_factory;

import org.andres.training.design.patterns.abstract_factory.products.Shirt;
import org.andres.training.design.patterns.abstract_factory.products.Shoe;
import org.andres.training.design.patterns.abstract_factory.products.Trousers;

public interface ClothesFactory {
    Shoe createShoe();
    Shirt createShirt();
    Trousers createTrousers();
}
