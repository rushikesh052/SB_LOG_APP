package com.rushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbLogAppApplication {
	
	public void add() {
		System.out.println("work going on ......");
	}

	public static void main(String[] args) {
		SpringApplication.run(SbLogAppApplication.class, args);	
		

	}
	
	

}
