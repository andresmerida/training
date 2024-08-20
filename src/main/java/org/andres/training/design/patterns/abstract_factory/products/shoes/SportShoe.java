package org.andres.training.design.patterns.abstract_factory.products.shoes;

import org.andres.training.design.patterns.abstract_factory.products.Shoe;

public class SportShoe implements Shoe {
    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos elegantes? -> No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos para correr? -> Yes");
        return true;
    }
}
