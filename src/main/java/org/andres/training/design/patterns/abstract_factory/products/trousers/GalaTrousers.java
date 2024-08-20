package org.andres.training.design.patterns.abstract_factory.products.trousers;

import org.andres.training.design.patterns.abstract_factory.products.Trousers;

public class GalaTrousers implements Trousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones de gala -- tienen bolsillos? -> Si");
        return false;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones de gala -- tienen cierre? -> cremayera");
        return "cremayera";
    }
}
