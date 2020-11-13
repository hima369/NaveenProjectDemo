package com.wf.training.mavenweb.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wf.training.mavenweb.model.Student;

@RestController
@RequestMapping("/api")
public class RestTestController {

	@RequestMapping("/test")
	public String test() {
		return "Hello";
	}
	
	@RequestMapping("/student")
	public Student student() {
		Student student = new Student("First", "first@mail.com", 25);
		return student;
	}
	
	@RequestMapping("/student-all")
	public List<Student> student_all() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("First", "first@mail.com", 25));
		students.add(new Student("Second", "second@mail.com", 27));
		students.add(new Student("Third", "third@mail.com", 29));
		
		
		return students;
	}

	// @RequestMapping(value = "/student-new", method = RequestMethod.POST)
	@PostMapping("/student-new")
	public String student_new(@RequestBody Student student) {
		System.out.println(student);
		
		
		return "Got it!";
	}
}















