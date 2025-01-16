package com.emp.Crud.service;

import com.emp.Crud.entity.Employee;
import com.emp.Crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();

    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}