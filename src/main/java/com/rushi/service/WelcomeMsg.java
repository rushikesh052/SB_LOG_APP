package com.rushi.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeMsg implements WelcomeService{

	@Override
	public String getWelcomeMsg() {
		// TODO Auto-generated method stub
		return "welcome to Ashok IT";
	}

}
