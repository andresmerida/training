package org.andres.hakerrank.data_structures.queue.priority_queue;

import java.util.*;

public class Priorities {
    public List<Student> getStudents(List<String> events) {
        // Create PriorityQueue<Student>  with a custom comparator
        Queue<Student> pq = new PriorityQueue<>(
                Comparator.comparingDouble(Student::cgpa).reversed()    // reversed because highest cgpa first
                        .thenComparing(Student::name)
                        .thenComparing(Student::id)
        );

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                pq.add(new Student(
                            Integer.parseInt(parts[3]),
                            parts[1],
                            Double.parseDouble(parts[2])
                        )
                );
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            } else {
                throw new IllegalArgumentException("Invalid event: " + event);
            }
        }

        List<Student> students = new ArrayList<>();
        while (!pq.isEmpty()) {
            students.add(pq.poll());
        }

        return students;
    }
}


