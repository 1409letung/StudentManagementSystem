package com.myweb.sms.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myweb.sms.entities.Student;
import com.myweb.sms.reponsitories.StudentReponsitory;
import com.myweb.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentReponsitory studentReponsitory;

	public StudentServiceImpl(StudentReponsitory studentReponsitory) {
		super();
		this.studentReponsitory = studentReponsitory;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentReponsitory.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentReponsitory.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentReponsitory.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentReponsitory.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentReponsitory.deleteById(id);
	}

}
