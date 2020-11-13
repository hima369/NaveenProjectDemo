package com.wf.training.mavenweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wf.training.mavenweb.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/home")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		Student student = new Student();  // empty bag
		// student.setName("Dummy");
		model.addAttribute("student", student);
		return "student-profile";
	}
	
	// @ModelAttribute will put the param data into model object
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProfile(@ModelAttribute Student student) {
		// pass the student object to view page to display
		return "student-confirm";
	}
}



