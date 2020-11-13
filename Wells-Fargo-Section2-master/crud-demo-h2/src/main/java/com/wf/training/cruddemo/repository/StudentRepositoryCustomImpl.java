package com.wf.training.cruddemo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.wf.training.cruddemo.entity.Student;

public class StudentRepositoryCustomImpl implements StudentRepositoryCustom{

	// special bean exposed by JPA
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Student> veryComplexBusinessLogicQuery(String email) {
		// TODO Auto-generated method stub
		return null;
		
	}

}
