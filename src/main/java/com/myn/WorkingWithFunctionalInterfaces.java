package com.myn;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.myn.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class WorkingWithFunctionalInterfaces {
    public static void main(String[] args) {
        approach1();
        approach2();
    }

    private static void approach1() {
        // "Cmd + Option + V" => Extract variable
        Optional<List<Employee>> employeeList = getEmployees();

        Predicate<List<Employee>> listPredicate = employees -> employees.size() > 0;
        Function<List<Employee>, Set<String>> listSetFunction = employees -> employees.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toSet());
        Supplier<Set<String>> setSupplier = () -> ImmutableSet.<String>builder()
                .add("Employee1")
                .add("Employee2")
                .build();
        Consumer<String> println = System.out::println;

        employeeList
                .filter(listPredicate)
                .map(listSetFunction)
                .orElseGet(setSupplier)
                .forEach(println);
    }

    private static void approach2() {
        Optional<List<Employee>> employeeList = getEmployees();
        employeeList
                .filter(employees -> employees.size() > 0)
                .map(employees -> employees.stream()
                        .map(employee -> employee.getName())
                        .collect(Collectors.toSet()))
                .orElseGet(() -> ImmutableSet.<String>builder()
                        .add("Employee1")
                        .add("Employee2")
                        .build())
                .forEach(System.out::println);
    }

    private static Optional<List<Employee>> getEmployees() {
        List<Employee> employees = ImmutableList.<Employee>builder()
                .add(new Employee("1", "Mayank", 25))
                .add(new Employee("2", "Naman", 24))
                .add(new Employee("3", "Nimish", 31))
                .build();
        return Optional.of(employees);
    }
}
