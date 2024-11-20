package com.meta.intagram.services;


import com.meta.intagram.models.User;
import com.meta.intagram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
    	System.out.print("disp......."+user.getName());
        return userRepository.save(user);
    }

    // Other service methods as needed
}