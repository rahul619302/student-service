package com.cg.student.service.starter.dao;

import com.cg.student.service.starter.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentDao extends JpaRepository<Student, Integer> {
}
