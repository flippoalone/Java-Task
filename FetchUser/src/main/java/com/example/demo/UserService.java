package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public String getUserById(int id) {
        return "User with ID " + id + " fetched from service.";
    }

    public String getAllUsers() {
        return "Returning all users from service.";
    }
    
}
