package com.teknopar.tyhmeleafCrudDemo.service.abstracts;

import com.teknopar.tyhmeleafCrudDemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
