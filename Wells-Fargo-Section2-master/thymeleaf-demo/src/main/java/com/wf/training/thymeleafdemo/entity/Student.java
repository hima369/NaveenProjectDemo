package com.wf.training.thymeleafdemo.entity;



import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Student {
	
	private String name;
	
	private String email;
	
	private Integer age;
}
