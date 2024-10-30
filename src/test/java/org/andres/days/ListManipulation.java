package org.andres.days;

import java.time.LocalDate;
import java.util.*;

public class ListManipulation {

    private static void removeItemUsingAnSpecificFilter(List<Person> team) {
        team.removeIf(person -> "Jordi".equals(person.getName()));
    }

    private static void removeItemUsingEquals(List<Person> team) {
        team.remove(new Person("1", "Messi", LocalDate.of(1940, 10, 9)));
    }

    static class Person {
        private String id;
        private String name;
        private LocalDate birthDate;

        public Person(String id, String name, LocalDate birthDate) {
            this.id = id;
            this.name = name;
            this.birthDate = birthDate;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            var person = (Person) o;
            return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(birthDate, person.birthDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, birthDate);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", birthDate=" + birthDate +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Person> team = new ArrayList<>();
        Person person1 = new Person("001", "Messi", LocalDate.of(1990, 9, 21));
        Person person2 = new Person("001", "Messi", LocalDate.of(1990, 9, 21));
        Person person3 = new Person("002", "Pique", LocalDate.of(1989, 8, 1));
        Person person4 = new Person("003", "Jordi", LocalDate.of(1990, 9, 21));
        Person person5 = new Person("004", "Busquets", LocalDate.of(1990, 9, 21));

        team.add(person1);
        team.add(person2);
        team.add(person3);
        team.add(person4);
        team.add(person5);

        removeItemUsingEquals(team);
        removeItemUsingAnSpecificFilter(team);
        System.out.println(team);

        System.out.println();
        System.out.println("Set collection");
        System.out.println();

        Set<Person> setTeam = new HashSet<>();
        setTeam.add(person1);
        setTeam.add(person2);
        setTeam.add(person3);
        setTeam.add(person4);
        setTeam.add(person5);

        System.out.println(setTeam);
    }
}
