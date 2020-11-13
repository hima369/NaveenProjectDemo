package com.wf.training.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}

	// default config class
	
}
/**
 * 1. Activates Auto Configuration
 * 		web application : deployed on web server : tomcat
 * 		start looking for custom config file : resources/application.properties  
 * 2. Default Component scanning path : current packages 
 */

