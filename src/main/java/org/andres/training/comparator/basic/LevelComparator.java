package org.andres.training.comparator.basic;

import java.util.Comparator;

public class LevelComparator implements Comparator<Level> {
    @Override
    public int compare(Level o1, Level o2) {
        return o1.level() - o2.level();
    }
}
