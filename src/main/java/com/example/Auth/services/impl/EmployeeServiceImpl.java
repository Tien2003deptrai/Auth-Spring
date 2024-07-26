package com.example.Auth.services.impl;

import com.example.Auth.entities.EmployeeEntity;
import com.example.Auth.models.Employee;
import com.example.Auth.repositories.EmployeeRepository;
import com.example.Auth.responses.LoginResponse;
import com.example.Auth.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String RegisterEmployee(Employee employeeRegister) {
        EmployeeEntity employeeEntity = new EmployeeEntity(
                employeeRegister.getEmployeeId(),
                employeeRegister.getEmployeeName(),
                employeeRegister.getEmail(),
                this.passwordEncoder.encode(employeeRegister.getPassword())
        );
        employeeRepository.save(employeeEntity);
        return employeeEntity.getEmployeeName();
    }

    @Override
    public LoginResponse LoginEmployee(Employee employeeLogin) {
        return null;
    }
}
