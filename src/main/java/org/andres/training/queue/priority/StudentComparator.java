package org.andres.training.queue.priority;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        final int cgpaCompare = Double.compare(o1.getCgpa(), o2.getCgpa());
        if (cgpaCompare == 0) {
            final int nameCompare = o1.getName().compareTo(o2.getName());
            if (nameCompare == 0) {
                return Integer.compare(o1.getId(), o2.getId());
            }
            return nameCompare;
        }
        return cgpaCompare;
    }
}
