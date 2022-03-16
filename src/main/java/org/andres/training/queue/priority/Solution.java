package org.andres.training.queue.priority;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter zise: ");
        int numberOfEvents = in.nextInt();
        Queue<Student> studentComparators = new PriorityQueue<>(numberOfEvents, new StudentComparator());

        int index = 0;
        System.out.println(numberOfEvents+ " ... hola");
        while (index < numberOfEvents) {
            System.out.println("before in");
            String inputString = in.nextLine();
            System.out.println("after in...");
            String[] splitData = inputString.split(" ");
            if (EventType.valueOf(splitData[0]) == EventType.ENTER) {
                try {
                    Student student = instanceStudent(splitData);
                    if (validateStudent(student)) {
                        studentComparators.add(student);
                        index++;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Illegal argument exception. Try again...");
                }
            } else {
                studentComparators.remove();
                index++;
            }
        }

        showResults(studentComparators);
    }

    public static boolean validateStudent(Student student) {
        if (student.getCgpa() < 0 || student.getCgpa() > 4.00) {
            System.out.println("CGPA debe estar en el rango 0 <= CGPA <= 4.00. Try again");
            return false;
        }

        if (student.getId() < 1 || student.getId() > Math.pow(10, 5)) {
            System.out.println("ID out of range. Try again");
            return false;
        }

        if (student.getName().length() < 2 || student.getName().length() > 30) {
            System.out.println("Name should be greater than 1 and less than 31 characters. Try again");
            return false;
        }

        return true;
    }

    public static Student instanceStudent(String[] splitData) throws IllegalArgumentException {
        Student student = new Student(Integer.parseInt(splitData[3]),
                splitData[1],
                Double.parseDouble(splitData[2]));

        return student;
    }

    public static void showResults(Queue<Student> students) {
        while (!students.isEmpty()) {
            System.out.println(students.poll().getName());
        }
    }
}
