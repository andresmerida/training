package org.andres.training.comparator.example1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeServiceTest {
    private static EmployeeRepository employeeRepository;
    private static EmployeeService employeeService;

    @BeforeAll
    public static void beforeAll() {
        employeeRepository = mock(EmployeeRepository.class);
        employeeService = new EmployeeService(employeeRepository);
    }

    @Test
    void findAll() {
        when(employeeRepository.findAll()).thenReturn(getEmployees());
        assertEquals(employeeService.findAll().size(), getEmployees().size());
    }

    @Test
    void getEmployeesSortedByDepartment() {
        when(employeeRepository.findAll()).thenReturn(getEmployees());
        var result = employeeService.getEmployeesSortedByDepartment();
        var expected = List.of(
                new Employee("Ana", "Arevalo", "Accounting", 37),
                new Employee("Julio", "Arce", "Accounting", 39),
                new Employee("Andres", "Merida", "IT", 37),
                new Employee("Andres", "Perez", "IT", 25)
        );
        assertEquals(expected, result);
    }

    @Test
    void getEmployeesSortedByDepartmentAndNameAndAge() {
        when(employeeRepository.findAll()).thenReturn(getEmployees());
        var result = employeeService.getEmployeesSortedByDepartmentAndNameAndAge();
        var expected = List.of(
                new Employee("Ana", "Arevalo", "Accounting", 37),
                new Employee("Julio", "Arce", "Accounting", 39),
                new Employee("Andres", "Perez", "IT", 25),
                new Employee("Andres", "Merida", "IT", 37)
        );
        assertEquals(expected, result);
    }

    @Test
    void getEmployeesSortedByDepartmentAndNameAndAgeDesc() {
        when(employeeRepository.findAll()).thenReturn(getEmployees());
        var result = employeeService.getEmployeesSortedByDepartmentAndNameAndAgeDesc();
        var expected = List.of(
                new Employee("Ana", "Arevalo", "Accounting", 37),
                new Employee("Julio", "Arce", "Accounting", 39),
                new Employee("Andres", "Merida", "IT", 37),
                new Employee("Andres", "Perez", "IT", 25)
        );
        assertEquals(expected, result);
    }

    private List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Andres", "Merida", "IT", 37));
        employees.add(new Employee("Ana", "Arevalo", "Accounting", 37));
        employees.add(new Employee("Andres", "Perez", "IT", 25));
        employees.add(new Employee("Julio", "Arce", "Accounting", 39));
        return employees;
    }
}