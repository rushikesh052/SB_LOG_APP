package com.rushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rushi.service.WelcomeService;

@RestController
public class Controller {
	
	@Autowired
	private WelcomeService service;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return service.getWelcomeMsg();
	}

}
