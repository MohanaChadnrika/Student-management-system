package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Chandu", "peruru", "chandu@gmail.com");
//		studentRepository.save(s1);
//		Student s2 = new Student("Sri", "mallu", "sri@gmail.com");
//		studentRepository.save(s2);
//		Student s3 = new Student("Lakshmi", "Devi", "Lakshmi@gmail.com");
//		studentRepository.save(s3);
	}

}
