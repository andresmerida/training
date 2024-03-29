package org.andres.training.comparator.basic;

import java.util.ArrayList;
import java.util.List;

public class MainBasicComparator {
    public static void main(String[] args) {
        Level level1 = new Level((short) 1, "Primer Semestre");
        Level level2 = new Level((short) 2, "Segundo Semestre");
        Level level3 = new Level((short) 3, "Tercer Semestre");
        List<Level> levelList = new ArrayList<>();
        levelList.add(level3);
        levelList.add(level2);
        levelList.add(level1);

        Curriculum curriculum = new Curriculum(1,
                "Ing. Sistemas",
                levelList
                );
        curriculum.levelList().sort(new LevelComparator());

        System.out.println(curriculum.levelList());
    }
}
