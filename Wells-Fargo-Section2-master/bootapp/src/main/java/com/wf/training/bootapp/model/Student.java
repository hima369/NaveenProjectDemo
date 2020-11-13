package com.wf.training.bootapp.model;

public class Student {
	private String name;
	private String email;
	private Integer age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String email, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	
}
