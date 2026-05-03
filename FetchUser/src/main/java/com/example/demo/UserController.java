package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	 @GetMapping("/{id}")
	    public String getUserById(@PathVariable int id) {
	        // Simulating a user fetch
	        return "User fetched with ID: " + id;
	    }
}
