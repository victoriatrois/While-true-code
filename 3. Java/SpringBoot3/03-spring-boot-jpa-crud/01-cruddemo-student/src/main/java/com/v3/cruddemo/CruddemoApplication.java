package com.v3.cruddemo;

import com.v3.cruddemo.dao.StudentDAO;
import com.v3.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);

			createMultipleStudents(studentDAO);

//			readStudent(studentDAO);

//			retrieveAllStudents(studentDAO);

//			retrieveAllStudentsByLastname(studentDAO);

//			updateStudent(studentDAO);

//			deleteStudent(studentDAO);

//			deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students...");
		int numberOfStudentsDeleted = studentDAO.deleteAll();

		System.out.println("All students deleted, a total of " + numberOfStudentsDeleted + ".");
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentToDeletesId = 6;
		System.out.println("Deleting student with id: " + studentToDeletesId);
		studentDAO.delete(studentToDeletesId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student studentToUpdate = studentDAO.findById(studentId);

		System.out.println("Updating student...");
		studentToUpdate.setFirstName("Gabriel");

		studentDAO.update(studentToUpdate);
		// display the updated student
		System.out.println("Updated student: " + studentDAO.findById(studentId));
	}

	private void retrieveAllStudentsByLastname(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Vieira");

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void retrieveAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating a new student object...");
		Student newStudent = new Student("Amanda", "Dias", "mandias@gmail.com");

		System.out.println("Saving the student...");
		studentDAO.save(newStudent);

		int newStudentsId = newStudent.getId();
		System.out.println("Saved student. Generated id: " + newStudentsId);

		System.out.println("Retrieving student with id: " + newStudentsId);
		Student retrievedStudent = studentDAO.findById(newStudentsId);

		System.out.println("Student found.\nRetrieved student: " + retrievedStudent);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student object...");
		Student newStudent = new Student("Gabriel", "Lisboa", "lisbogab@gmail.com");

		System.out.println("Saving student...");
		studentDAO.save(newStudent);

		System.out.println("Saved student. Generated id: " + newStudent.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 4 student objects...");

		Student newStudent1 = new Student("Bruno", "Leal", "brunolealnapaz@gmail.com");
		Student newStudent2 = new Student("Kayane", "Vieira", "kayvieira@gmail.com");
		Student newStudent3 = new Student("Bruno", "Feijó", "nofeijoh@gmail.com");
		Student newStudent4 = new Student("Norton", "dos Santos", "santosnorton@gmail.com");

		System.out.println("Saving students...");

		studentDAO.save(newStudent1);
		studentDAO.save(newStudent2);
		studentDAO.save(newStudent3);
		studentDAO.save(newStudent4);

		System.out.println("Saved students. Generated ids: " + newStudent1.getId() + ", " + newStudent2.getId() + ", " + newStudent3.getId() + ", " + newStudent4.getId());
	}
}
