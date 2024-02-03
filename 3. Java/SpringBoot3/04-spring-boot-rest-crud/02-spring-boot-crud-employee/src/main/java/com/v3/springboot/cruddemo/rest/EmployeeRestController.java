package com.v3.springboot.cruddemo.rest;

import com.v3.springboot.cruddemo.dao.EmployeeDAO;
import com.v3.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO injectedEmployeeDAO) {
        employeeDAO = injectedEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findEmployees() {
        return employeeDAO.findEmployees();
    }
}
