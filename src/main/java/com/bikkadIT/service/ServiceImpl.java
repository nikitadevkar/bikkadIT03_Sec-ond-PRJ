package com.bikkadIT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIT.Repo.StudentRepository;
import com.bikkadIT.model.Student;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public class ServiceImpl  implements ServiceI{
@Autowired
private StudentRepository  studentRepository;
	@Override
	public int addStudent(Student student) {
		Student save= studentRepository.save(student);
		return save.getSid();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student>findAll=studentRepository.findAll();
		return findAll;
	}

	

	@Override
	public Student getStudentById(int id) {
		Student findById=studentRepository.findById(id).get();
		return findById;
	}

}
