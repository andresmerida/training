package org.andres.coderbyte.hascode;

import java.util.Objects;

public class Person {
    private Long id;
    private String identification;
    private String fullName;
    private String phone;

    public Person(Long id, String identification, String fullName, String phone) {
        this.id = id;
        this.identification = identification;
        this.fullName = fullName;
        this.phone = phone;
    }

    public Person() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(identification, person.identification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identification);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", identification='" + identification + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
