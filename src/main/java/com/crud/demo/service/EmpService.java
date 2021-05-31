package com.crud.demo.service;

import com.crud.demo.entitites.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpService {

    private static Map<Long, Employee> employees = new HashMap<>();
    private static Long index =2L;

    static {
        Employee employee1 = new Employee(1L, "emp1", "99999999", 200000L);
        Employee employee2 = new Employee(2L, "emp2", "888888888", 300000L);
        employees.put(1L, employee1);
        employees.put(2L, employee2);
    }

    public static List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public static Employee getEmployeeDetails(Long employeeId) {
        return employees.get(employeeId);
    }

    public static Employee addEmployee(Employee employee) {
        index += 1;
        employee.setId(index);
        employees.put(index, employee);
        return employee;
    }

    public static Employee updateEmployee(long employeeId, Employee employee) {
        employee.setId(employeeId);
        employees.put(employeeId, employee);
        return employee;
    }

    public static Employee deleteEmployee(Long employeeId) {
        return employees.remove(employeeId);
    }

}
