package com.example.Auth.services;

import com.example.Auth.models.Employee;
import com.example.Auth.responses.LoginResponse;

public interface EmployeeService {
    String RegisterEmployee(Employee employeeRegister);
    LoginResponse LoginEmployee(Employee employeeLogin);
}
