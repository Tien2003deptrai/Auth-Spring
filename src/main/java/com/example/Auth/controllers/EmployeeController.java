package com.example.Auth.controllers;

import com.example.Auth.models.Employee;
import com.example.Auth.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public String registerEmployee(@RequestBody Employee employee) {
        employeeService.RegisterEmployee(employee);
        return "Employee registered successfully";
    }
}
