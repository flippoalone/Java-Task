package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

//    Fetch all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

//     Fetch user by ID
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public User updateUser(int id, User updatedUser) {
        User existing = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));

        existing.setName(updatedUser.getName());
        existing.setEmail(updatedUser.getEmail());

        return userRepository.save(existing);  
    }

    public String deleteUser(int id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with ID: " + id);
        }
        userRepository.deleteById(id);
        return "User with ID " + id + " deleted successfully.";
    }
}
