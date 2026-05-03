package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
//	injects UserService here
	@Autowired
    private UserService userService; 
	
	 @GetMapping("/{id}")
	    public String getUserById(@PathVariable int id) {
	        // Simulating a user fetch
	        return "User fetched with ID: " + id;
	    }
	 
	 @GetMapping("/all")
	    public String getAllUsers() {
	        return userService.getAllUsers();
	    }
}
