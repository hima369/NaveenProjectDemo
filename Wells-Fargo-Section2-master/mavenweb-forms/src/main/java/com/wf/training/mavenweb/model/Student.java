package com.wf.training.mavenweb.model;

import java.util.LinkedHashMap;

public class Student {
	
	private String name;
	private String email;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countries;
	
	// populate th country list
	public Student() {
		// dummy values (can be fetched using DAO)
		this.countries = new LinkedHashMap<String, String>();
		this.countries.put("FR", "France");
		this.countries.put("IN", "India");
		this.countries.put("GR", "Germany");
		this.countries.put("US", "USA");
	}
	
	
	
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}



	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}



	public String[] getOperatingSystems() {
		return operatingSystems;
	}



	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
