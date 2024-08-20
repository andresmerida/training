package org.andres.training.design.patterns.abstract_factory.products.trousers;

import org.andres.training.design.patterns.abstract_factory.products.Trousers;

public class SportTrousers implements Trousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones deportivos -- tienen bolsillos? -> No");
        return false;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones deportivos -- tipo de cierre? -> Sin cierre");
        return "Sin cierre";
    }
}
