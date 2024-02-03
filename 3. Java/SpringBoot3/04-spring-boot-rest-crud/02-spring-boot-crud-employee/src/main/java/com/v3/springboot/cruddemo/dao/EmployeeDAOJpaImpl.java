package com.v3.springboot.cruddemo.dao;

import com.v3.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager injectedEntityManager) {
        entityManager = injectedEntityManager;
    }

    @Override
    public List<Employee> findEmployees() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = query.getResultList();

        return employees;
    }
}
