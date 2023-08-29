package com.myweb.sms.services;

import java.util.List;

import com.myweb.sms.entities.Student;

public interface StudentService {
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Long id);
}
