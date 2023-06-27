package com.student.registration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/getdetails")
	public ResponseEntity<String> getStudentDetails() {
		
		System.out.println("In Student Method");
	
		
		return new ResponseEntity<>("getDetails", HttpStatus.OK);
		
	}
	

}
