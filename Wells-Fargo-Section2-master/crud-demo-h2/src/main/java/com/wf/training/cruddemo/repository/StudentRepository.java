package com.wf.training.cruddemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wf.training.cruddemo.entity.Student;

// public interface StudentRepository extends CrudRepository<T, ID>{
// @Component
@Repository
public interface StudentRepository 
					extends JpaRepository<Student, Long>, StudentRepositoryCustom{
	// Basic crud functionalities are already exposed
	List<Student> findByEmail(String email);
	
	// JPQL
	// Student : Java class
	// :<variable name>
	@Query("select s from Student s where s.age>:studAge and s.email=:studEmail")
	List<Student> findByComplexRequirement(@Param("studAge") Integer studAge, @Param("studEmail") String studEmail);
}

/**
 * Custom implementation
 * 1. Naming Convention : add a appropriatly named method in interface, implementation will be provided on the fly
 * 2. Query implementation
 * 3. Custom Interface with implementation which can be plugged with existing interface
 */












