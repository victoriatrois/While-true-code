package com.v3.springboot.cruddemo.dao;

import com.v3.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findEmployees();
}
