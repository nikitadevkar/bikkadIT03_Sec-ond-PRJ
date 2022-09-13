 package com.bikkadIT.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIT.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
