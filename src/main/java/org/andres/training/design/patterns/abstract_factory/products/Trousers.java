package org.andres.training.design.patterns.abstract_factory.products;

public interface Trousers {
    boolean hasPockets();       // si los pantalones tienen bolsillos
    String getClosureType();    // tipo de cierre de los pantalones (cierre, botones, sin cierre)
}
