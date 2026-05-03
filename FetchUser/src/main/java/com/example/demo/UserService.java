package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public String getUserById(int id) {
        return "User ID " + id + " fetched service.";
    }

    public String getAllUsers() {
        return "Returning users from service.";
    }
    
}
