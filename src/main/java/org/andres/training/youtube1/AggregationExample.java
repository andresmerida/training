package org.andres.training.youtube1;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
    // Student class
    static class Student {
        String name;
        int enrol;
        String course;

        public Student(String name, int enrol, String course) {
            this.name = name;
            this.enrol = enrol;
            this.course = course;
        }
    }

    // Course class having a list of students
    static class Course{
        String name;
        private final List<Student> students;

        public Course(String name, List<Student> students) {
            this.name = name;
            this.students = students;
        }

        public List<Student> getStudents() {
            return students;
        }
    }

    // College class having a list of courses
    static class College {
        private String name;
        private final List<Course> courses;

        public College(String name, List<Course> courses) {
            this.name = name;
            this.courses = courses;
        }

        public String getName() {
            return name;
        }

        public List<Course> getCourses() {
            return courses;
        }

        // Returning number of students available in all courses in a given college
        public int countStudents() {
            int count = 0;
            for (Course course : courses) {
                count += course.getStudents().size();
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 10, "MCA");
        Student s2 = new Student("Jane", 20, "BSC-CS");
        Student s3 = new Student("Jack", 30, "POLY");
        Student s4 = new Student("Jane", 40, "MCA");
        Student s5 = new Student("Jack", 50, "POLY");

        // Constructing list of MCA Students
        List<Student> mcaStudents = new ArrayList<>();
        mcaStudents.add(s1);
        mcaStudents.add(s4);

        // Constructing list of BSC-CS students
        List<Student> bscCsStudents = new ArrayList<>();
        bscCsStudents.add(s2);

        // Constructing list of Poly students
        List<Student> polyStudents = new ArrayList<>();
        polyStudents.add(s3);
        polyStudents.add(s5);

        Course mcaCourse = new Course("MCA", mcaStudents);
        Course bscCsCourse = new Course("BSC-CS", bscCsStudents);
        Course polyCourse = new Course("POLY", polyStudents);

        List<Course> courses = new ArrayList<>();
        courses.add(mcaCourse);
        courses.add(bscCsCourse);
        courses.add(polyCourse);

        // creating object of College
        College college = new College("ABES", courses);
        System.out.println("Total number of students in the college: " + college.getName() + " is " + college.countStudents());
    }
}
