package org.andres.training.comparator.example1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl {
    List<Employee> employees;
    public EmployeeRepositoryImpl() {
        employees = new ArrayList<>();
        employees.add(new Employee("Andres", "Merida", "IT", 37));
        employees.add(new Employee("Ana", "Arevalo", "Accounting", 37));
        employees.add(new Employee("Andres", "Perez", "IT", 25));
        employees.add(new Employee("Julio", "Arce", "Accounting", 39));
    }
}
