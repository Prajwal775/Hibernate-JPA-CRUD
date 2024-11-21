package com.example.CrudDemo;

import com.example.CrudDemo.dao.StudentDAO;
import com.example.CrudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)//executed after the spring beans have been loaded
	{
		return runner -> {
			//createMultipleStudents(studentDAO);
//			readStudentid(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			updateStudent(studentDAO);

		};
	}
	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name to "John"
		System.out.println("Updating student ...");
		myStudent.setFirstName("John");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated student: " + myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Doe");

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
	private void readStudentid(StudentDAO stuadentDAO) {
		//create the student object
		System.out.println("creating new student object");
		Student tempStudent4=new Student("ram","singh","ramsingh22@gmail.com");


		//save the student object
		System.out.println("Saving student object");

		stuadentDAO.save(tempStudent4);
		//display id of the student object
		int theid= tempStudent4.getId();
		System.out.println("Saved student:Generated id:" + tempStudent4.getId());

		//retrvieng id
		System.out.println("retrieving student with id"+ tempStudent4.getId());
		Student myStudent=stuadentDAO.findStudentid(theid);


		//display
		System.out.println("foubd the student:v"+ myStudent);

	}

	private void createStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("creating new student object");
		Student tempStudent = new Student("piyush", "bharti", "piyushbharti78@gmail.com");


		//save the student object
		System.out.println("Saving student object");

		studentDAO.save(tempStudent);
		//display id of the student object
		System.out.println("Saved studnent:Generated id:" + tempStudent.getId());

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

//create the student object
		System.out.println("creating new student object");

		Student tempStudent1 = new Student("baka", "yadav", "piyushbharti78@gmail.com");
		Student tempStudent2= new Student("ayushh", "sunwar", "piyushbharti78@gmail.com");
		Student tempStudent3 = new Student("pranay", "saray", "piyushbharti78@gmail.com");


		//save the student object
		System.out.println("Saving student object");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}
}
