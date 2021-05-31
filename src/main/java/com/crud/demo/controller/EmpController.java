package com.crud.demo.controller;

import com.crud.demo.entitites.Employee;
import com.crud.demo.service.EmpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return EmpService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeDetails(@PathVariable Long employeeId) {
        return EmpService.getEmployeeDetails(employeeId);
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return EmpService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee/{employeeId}")
    public Employee updateEmployee(@PathVariable Long employeeId, @RequestBody Employee employee) {
        return EmpService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    public Employee deleteEmployee(@PathVariable Long employeeId) {
        return EmpService.deleteEmployee(employeeId);
    }
}
