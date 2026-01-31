package org.andres.common.parent_operations;

public class NauticalMilesToKmConverter extends MilesToKmConverter {
    @Override
    public double getMilesToKmFactor() {
        return 1.852;
    }
}
