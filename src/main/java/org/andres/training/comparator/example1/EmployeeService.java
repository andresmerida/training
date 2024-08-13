package org.andres.training.comparator.example1;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeesSortedByDepartment() {
        List<Employee> employees = employeeRepository.findAll();
        employees.sort(Comparator.comparing(Employee::department));
        return employees;
    }

    public List<Employee> getEmployeesSortedByDepartmentAndNameAndAge() {
        List<Employee> employees = employeeRepository.findAll();
        employees.sort(Comparator
                .comparing(Employee::department)
                .thenComparing(Employee::firstName)
                .thenComparing(Employee::age)
        );
        return employees;
    }

    public List<Employee> getEmployeesSortedByDepartmentAndNameAndAgeDesc() {
        List<Employee> employees = employeeRepository.findAll();
        employees.sort(Comparator
                .comparing(Employee::department)
                .thenComparing(Employee::firstName)
                .thenComparing(Employee::age, Comparator.reverseOrder())
        );
        return employees;
    }
}
