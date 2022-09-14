package com.bikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.model.Student;
import com.bikkadIT.service.ServiceI;

@RestController
public class StudentController {
	@Autowired
	private ServiceI serviceI;
	@PostMapping(value="/addStudent",consumes = "application/json")
	public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
		 int id =serviceI.addStudent(student);
		return new ResponseEntity<Integer>(HttpStatus.CREATED);

}
}