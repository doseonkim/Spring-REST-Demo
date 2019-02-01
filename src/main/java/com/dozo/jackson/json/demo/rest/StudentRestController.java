package com.dozo.jackson.json.demo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dozo.jackson.json.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;
	
	@PostConstruct
	public void loadData() {
		students = new ArrayList<>();
		students.add(new Student("Doseon", "Kim"));
		students.add(new Student("Jun", "Kim"));
		students.add(new Student("Jordan", "Doan"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if (students.size() <= studentId || (studentId < 0)) 
			throw new StudentNotFoundException("Student id not found - " + studentId);
		
		return students.get(studentId);
	}

}
