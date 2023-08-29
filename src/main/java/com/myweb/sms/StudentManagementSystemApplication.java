package com.myweb.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myweb.sms.entities.Student;
import com.myweb.sms.reponsitories.StudentReponsitory;


@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentReponsitory studentReponsitory;
	@Override
	public void run(String... args) throws Exception {
//		Student st1 = new Student("Le", "Tung", "tung@yahoo.com");
//		studentResponsitory.save(st1);
//		Student st2 = new Student("Le", "Tung1", "tung1@yahoo.com");
//		studentResponsitory.save(st2);
		
	}

}
