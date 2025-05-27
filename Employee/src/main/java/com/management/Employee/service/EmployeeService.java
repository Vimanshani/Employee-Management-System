package com.management.Employee.service;

import com.management.Employee.entity.Employee;
import com.management.Employee.repository.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee postEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmployee(Long id){
        if(!employeeRepository.existsById(id)){
            throw new EntityNotFoundException("Employee with id"+ id+ "not founded.");
        }
        employeeRepository.deleteById(id);
    }
}

