package com.teknopar.tyhmeleafCrudDemo.repository;

import com.teknopar.tyhmeleafCrudDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
