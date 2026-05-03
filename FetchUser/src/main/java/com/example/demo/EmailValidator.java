package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EmailValidator {

	 public boolean isValid(String email) {
	        return email != null && email.contains("@") && email.contains(".");
	    }
} 
