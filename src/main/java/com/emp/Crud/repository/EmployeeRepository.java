package com.emp.Crud.repository;

import com.emp.Crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface EmployeeRepository  extends JpaRepository<Employee,Long> {


}