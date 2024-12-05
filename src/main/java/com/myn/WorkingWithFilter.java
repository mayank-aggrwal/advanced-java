package com.myn;

import com.myn.model.Employee;

import java.util.List;
import java.util.function.Predicate;

public class WorkingWithFilter {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("1", "Mayank", 25),
                new Employee("1", "Naman", 24),
                new Employee("1", "Nimish", 31)
        );

        employees.stream()
                .filter(employee -> employee.getAge() > 24)
                .forEach(System.out::println);

        Predicate<Employee> employeePredicate = employee -> employee.getAge() > 24;
        employees.stream()
                .filter(Predicate.not(employeePredicate))
                .forEach(System.out::println);
    }
}
