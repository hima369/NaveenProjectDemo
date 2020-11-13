package com.wf.training.cruddemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.training.cruddemo.entity.Student;
import com.wf.training.cruddemo.repository.StudentRepository;
import com.wf.training.cruddemo.service.StudentService;

// @Component
@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository repository;
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@Override
	public Student getById(Long id) {
		// TODO Auto-generated method stub
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public Student add(Student student) {
		// TODO Auto-generated method stub
		return this.repository.save(student);
		// this.repository.findByEmail(email)
		// this.repository.findByComplexRequirement(20, "dummy@mail.com");
		// this.repository.veryComplexBusinessLogicQuery("dummy@mail.com");
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return this.repository.save(student); // save & update
	}

	@Override
	public Student delete(Long id) {
		// TODO Auto-generated method stub
		Student student = this.getById(id);
		if(student != null)
			this.repository.deleteById(id);
		return student;
	}

}
