package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Student4;


@RestController
public class StudentController {
	
	@PostMapping("/api/student")
	public void saveStudent(@RequestBody Student4 student) {
		
		System.out.println(
				student);
	}

}
