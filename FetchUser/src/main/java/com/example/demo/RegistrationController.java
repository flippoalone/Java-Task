package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegistrationController {

	 @Autowired
	    private UserRegistrationService registrationService;

	    @GetMapping
	    public String register(@RequestParam String name, @RequestParam String email) {
	        return registrationService.registerUser(name, email);
	    }
}
