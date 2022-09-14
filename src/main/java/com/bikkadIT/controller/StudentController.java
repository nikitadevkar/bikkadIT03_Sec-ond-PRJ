package com.bikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.model.Student;
import com.bikkadIT.service.ServiceI;

@RestController
public class StudentController {
	@Autowired
	private ServiceI serviceI;
	@PostMapping(value="/addStudent",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
		 int id =serviceI.addStudent(student);
		return new ResponseEntity<Integer>(HttpStatus.CREATED);

}
	@GetMapping(value="/getAllStudent",produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudent(){
		List <Student>allStudent=serviceI.getAllStudent();
		return new ResponseEntity<List<Student>>(allStudent,HttpStatus.OK);
		
	}
}