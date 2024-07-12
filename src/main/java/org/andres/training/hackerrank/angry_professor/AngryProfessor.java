package org.andres.training.hackerrank.angry_professor;

import java.util.List;

public class AngryProfessor {

    public String angryProfessorCancelledClass(int k, List<Integer> a) {
        if (k <= 0) {
            throw new IllegalArgumentException("K must be grater than to 0");
        }

        int punctualStudents = 0;
        for (Integer i : a) {
            if (i <= 0) {
                punctualStudents++;
            }
        }

        return k > punctualStudents? "YES" : "NO";
    }
}
