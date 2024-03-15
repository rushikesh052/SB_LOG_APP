package com.rushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbLogAppApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SbLogAppApplication.class, args);	
		

	}
	
	public Integer mul(int a, int b) {
		return a*b;
	}
	
	

}
