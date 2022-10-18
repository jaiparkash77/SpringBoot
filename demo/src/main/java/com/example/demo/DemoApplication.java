package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//What happens when "SpringApplication.run()" calls

	// Starting Spring boot
	// Class path scan? -> Read all files which is inside package and inside file check annotations (@) - runs function based on getmapping annotation assigned
	// Starts apache tomcat server

}
