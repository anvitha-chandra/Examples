package com;

import java.util.*;
import java.util.stream.*;

public class EmployeeStream {
    public static void main(String[] args) {
       
    	List<Employee> e = Arrays.asList(new Employee("Arvind", 28, 50000),
                new Employee("Priya", 35, 60000),
                new Employee("Ravi", 40, 70000),
                new Employee("Meera", 25, 40000),
                new Employee("Neha", 32, 55000)
            );

       
        List<String> names = new ArrayList<>();
        for (Employee e1 : e) {
            if (e1.getAge() > 30) {
                names.add(e1.getName());
            }
        }

       
        double totalSalary = 0;
        int count = 0;
        for (Employee e1 : e) {
            if (e1.getAge() > 30) {
                totalSalary += e1.getSalary();
                count++;
            }
        }
        double averageSalary = (count > 0) ? totalSalary / count : 0;

       
        System.out.println("Employees older than 30: " + names);
        System.out.println("Average salary of employees older than 30: " + averageSalary);
    }
}