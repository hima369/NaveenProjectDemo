package com.wf.training.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.training.cruddemo.entity.Student;
import com.wf.training.cruddemo.exception.StudentNotFoundException;
import com.wf.training.cruddemo.exception.model.ExceptionResponse;
import com.wf.training.cruddemo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = this.service.getAll();
		
		ResponseEntity<List<Student>> response = 
				new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
		Student student = this.service.getById(id);
		
		if(student == null) {
			throw  new StudentNotFoundException("Student not Found with Id-" + id);
		}
		
		ResponseEntity<Student> response = 
				new ResponseEntity<Student>(student, HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student addedStudent = this.service.add(student);
		ResponseEntity<Student> response = 
				new ResponseEntity<Student>(addedStudent, HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/students")
	public ResponseEntity<Student> editStudent(@RequestBody Student student) {
		Student updatedStudent = this.service.update(student);
		ResponseEntity<Student> response = 
				new ResponseEntity<Student>(updatedStudent, HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long id) {
		Student student = this.service.delete(id);
		if(student == null) {
			throw  new StudentNotFoundException("Student not Found with Id-" + id);
		}
		ResponseEntity<Student> response = 
				new ResponseEntity<Student>(student, HttpStatus.OK);
		return response;
	}
	
	// Exception Handler Method
	/*@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handler(StudentNotFoundException ex) {
		ExceptionResponse exResponse =
				new ExceptionResponse(ex.getMessage(), System.currentTimeMillis(), HttpStatus.NOT_FOUND.value());
		ResponseEntity<ExceptionResponse> response = 
				new ResponseEntity<ExceptionResponse>(exResponse, HttpStatus.NOT_FOUND);
		return response;
	}
	
	// Exception Handler Method
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handler(Exception ex) {
		ExceptionResponse exResponse =
				new ExceptionResponse(ex.getMessage(), System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ExceptionResponse> response = 
				new ResponseEntity<ExceptionResponse>(exResponse, HttpStatus.BAD_REQUEST);
		return response;
	}*/
	
	
}
