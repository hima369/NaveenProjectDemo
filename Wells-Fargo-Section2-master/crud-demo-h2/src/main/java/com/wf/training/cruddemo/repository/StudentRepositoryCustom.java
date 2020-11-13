package com.wf.training.cruddemo.repository;

import java.util.List;

import com.wf.training.cruddemo.entity.Student;

public interface StudentRepositoryCustom {
	List<Student> veryComplexBusinessLogicQuery(String email);
}
