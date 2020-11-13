package com.wf.training.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wf.training.thymeleafdemo.entity.Student;

@Controller
public class StudentController {

	// root mapping
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("val", "Thymeleaf Data Test");
		return "home-page";
	}
	
	@GetMapping("/students")
	public String getStudents(Model model) {
		
		// dummy Student list
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("First", "first@mail.com", 25));
		students.add(new Student("Second", "second@mail.com", 26));
		students.add(new Student("Third", "third@mail.com", 27));
		students.add(new Student("Fourth", "fourth@mail.com", 28));
		
		
		model.addAttribute("students", students);
		return "student-list";
	}
}
