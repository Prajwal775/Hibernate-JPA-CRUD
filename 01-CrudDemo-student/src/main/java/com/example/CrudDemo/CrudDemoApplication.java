package com.example.CrudDemo;

import com.example.CrudDemo.dao.StudentDAO;
import com.example.CrudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)//executed after the spring beans have been loaded
	{
		return runner -> {
			createMultipleStudents(studentDAO);
		};
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
