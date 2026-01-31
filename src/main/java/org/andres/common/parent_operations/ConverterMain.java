package org.andres.common.parent_operations;

public class ConverterMain {
    static void main(String[] args) {
        IO.println(new NauticalMilesToKmConverter().milesToKm(1));
        IO.println(new MilesToKmConverter().milesToKm(1));
    }
}
