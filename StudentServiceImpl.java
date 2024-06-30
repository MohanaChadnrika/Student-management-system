package com.example.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentrepository;

	public StudentServiceImpl(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentrepository.findAll();
	}

	public Student saveStudent(Student student) {

		return studentrepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {

		return studentrepository.findById(id).get();
	}

	@Override
	public Student UpdateStudent(Student student) {

		return studentrepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentrepository.deleteById(id);

	}

}
