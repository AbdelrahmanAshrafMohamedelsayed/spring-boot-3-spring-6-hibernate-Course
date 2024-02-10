package com.DBMaven03.CRUDDemoMaven03;

import com.DBMaven03.CRUDDemoMaven03.dao.StudentDAO;
import com.DBMaven03.CRUDDemoMaven03.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoMaven03Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoMaven03Application.class, args);
	}

	//	Set the command line runner to run the code
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) { // this will be executed after the beans is created
// 1. inject the student dao in the bracket () of the commandLineRunner
		return runner -> {
//			System.out.println("Hello world");
//create student
//			createStudent(studentDAO);
//			CreateMultipleStudents(studentDAO);
//			Find by id
			readStudent(studentDAO);

		};
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");
		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
		// retrieve student based on the id: primary key
		System.out.println("\nRetrieving student with id: " + tempStudent.getId());
		Student myStudent = studentDAO.findById(tempStudent.getId());
		System.out.println("Found the student: " + myStudent);
	}

	private void CreateMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 3 new students objects...");
		Student tempStudent1 = new Student("Paul1", "Doe1", "paul@luv2code25.com");
		Student tempStudent2 = new Student("Paul2", "Doe2", "paul@luv2code852.com");
		Student tempStudent3 = new Student("Paul3", "Doe3", "paul@luv2code852.com");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		System.out.println("Saved 3 students. Generated id: " + tempStudent1.getId() + " " + tempStudent2.getId() + " " + tempStudent3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent); // save the student
		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
