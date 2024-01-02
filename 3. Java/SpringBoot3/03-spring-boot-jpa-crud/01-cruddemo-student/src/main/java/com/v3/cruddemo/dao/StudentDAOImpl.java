package com.v3.cruddemo.dao;

import com.v3.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager entityManager;

    @Autowired // Optional if there is only one constructor
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student); // saves the studentDAO to the database
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> retrieveAllStudents = entityManager.createQuery("FROM Student", // FROM Student order by lastName -> to order by last name ascending.
                                                                                Student.class);

        return retrieveAllStudents.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> retrieveAllStudentsByLastName = entityManager.createQuery("FROM Student WHERE lastName = :lastName", Student.class);
        retrieveAllStudentsByLastName.setParameter("lastName", lastName);
        return retrieveAllStudentsByLastName.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student studentToDelete = entityManager.find(Student.class, id);

        entityManager.remove(studentToDelete);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numberOfDeletedRows = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numberOfDeletedRows;
    }
}
