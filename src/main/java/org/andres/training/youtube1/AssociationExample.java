package org.andres.training.youtube1;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");

        Mobile number1 = new Mobile();
        number1.setNumber("978-3-16-1484-0");
        Mobile number2 = new Mobile();
        number2.setNumber("978-3-16-1484-4");

        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(number1);
        mobiles.add(number2);

        person.setNumbers(mobiles);
        System.out.println(person.getNumbers() + " are mobile numbers of the person " + person.getName());
    }

    static class Mobile {
        private String number;

        public Mobile() {}

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }

    static class Person {
        private String name;
        List<Mobile> numbers;

        public Person() {}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Mobile> getNumbers() {
            return numbers;
        }

        public void setNumbers(List<Mobile> numbers) {
            this.numbers = numbers;
        }
    }
}
