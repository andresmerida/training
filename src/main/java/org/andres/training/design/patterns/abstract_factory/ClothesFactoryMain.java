package org.andres.training.design.patterns.abstract_factory;

import org.andres.training.design.patterns.abstract_factory.factories.GalaClothesFactory;
import org.andres.training.design.patterns.abstract_factory.factories.SportClothesFactory;
import org.andres.training.design.patterns.abstract_factory.products.shirts.GalaShirt;
import org.andres.training.design.patterns.abstract_factory.products.shirts.SportShirt;
import org.andres.training.design.patterns.abstract_factory.products.shoes.GalaShoe;
import org.andres.training.design.patterns.abstract_factory.products.shoes.SportShoe;
import org.andres.training.design.patterns.abstract_factory.products.trousers.GalaTrousers;
import org.andres.training.design.patterns.abstract_factory.products.trousers.SportTrousers;

public class ClothesFactoryMain {
    public static void main(String[] args) {
        // sport factory
        ClothesFactory sportClothesFactory = new SportClothesFactory();

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoe();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrousers();

        System.out.println("\n ---> Example sport clothes ---");
        sportShirt.hasButtons();
        sportTrousers.getClosureType();
        sportShoe.isRunningShoes();

        ClothesFactory galaClothesFactory = new GalaClothesFactory();
        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoe();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrousers();

        System.out.println("\n ---> Example gala clothes ---");
        galaShirt.hasButtons();
        galaTrousers.getClosureType();
        galaShoe.isRunningShoes();
    }
}
