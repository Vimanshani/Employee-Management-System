package com.management.Employee.service;

import com.management.Employee.entity.Employee;
import com.management.Employee.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

@Service


public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee postEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
