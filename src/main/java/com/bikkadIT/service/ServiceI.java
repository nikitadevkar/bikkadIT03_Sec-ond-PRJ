package com.bikkadIT.service;

import java.util.List;

import com.bikkadIT.model.Student;

public interface ServiceI {
 public int addStudent(Student student);
 public List<Student> getAllStudent();
 public Student getStudentById(int id);
}
