package com.myweb.sms.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myweb.sms.entities.Student;

public interface StudentReponsitory extends JpaRepository<Student, Long>{

}
