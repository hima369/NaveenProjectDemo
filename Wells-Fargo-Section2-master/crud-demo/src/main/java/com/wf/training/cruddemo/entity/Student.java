package com.wf.training.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
@NoArgsConstructor
// @AllArgsConstructor
//@ToString
@Data
@Entity // auto map class with table student in db
// @Table(name = "studentmaster") // mapped with table studentmaster in db
public class Student {
	// all fields will map to col in table
	
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private Long id;
	
	// @Column(name = "studentname")
	private String name;
	
	private String email;
	
	private Integer age;
}
