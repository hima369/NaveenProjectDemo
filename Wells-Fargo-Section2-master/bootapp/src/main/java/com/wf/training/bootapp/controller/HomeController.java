package com.wf.training.bootapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.training.bootapp.model.Student;



@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String home() {
		return "Hello All";
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
		students.add(new Student("Fourth", "fourth@mail.com", 30));
		
		
		return students;
	}

	// @RequestMapping(value = "/student-new", method = RequestMethod.POST)
	@PostMapping("/student-new")
	public String student_new(@RequestBody Student student) {
		System.out.println(student);
		
		
		return "Got it!";
	}
	
}
