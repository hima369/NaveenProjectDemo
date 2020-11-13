package com.wf.training.cruddemo.service;

import java.util.List;

import com.wf.training.cruddemo.entity.Student;

public interface StudentService {
	
	public List<Student> getAll();
	public Student getById(Long id);
	public Student add(Student student);
	public Student update(Student student);
	public Student delete(Long id);
}
