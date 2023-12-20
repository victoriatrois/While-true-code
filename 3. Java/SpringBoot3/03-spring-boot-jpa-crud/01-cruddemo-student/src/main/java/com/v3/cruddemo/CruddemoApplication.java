package com.v3.cruddemo;

import com.v3.cruddemo.dao.StudentDAO;
import com.v3.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student object...");
		Student newStudent = new Student("Norton", "dos Santos", "santosnorton@gmail.com");

		System.out.println("Saving student...");
		studentDAO.save(newStudent);

		System.out.println("Saved student. Generated id: " + newStudent.getId());
	}
}
