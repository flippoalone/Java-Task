package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

	 @Autowired
	    private EmailValidator emailValidator;   // @Component bean injected here

	    public String registerUser(String name, String email) {
	        if (emailValidator.isValid(email)) {
	            return "User '" + name + "' registered successfully with email: " + email;
	        } else {
	            return "Invalid email address: " + email;
	        }
	    }
	    
}
