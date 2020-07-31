package com.fitness.webapp.controllers;

import com.fitness.webapp.model.Login;
import com.fitness.webapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("/register_user")
public class UserRegisterController {
    private final UserService userService;

    @Autowired
    public UserRegisterController(UserService userService) {
        this.userService = userService;
    }

    // TODO: change return value to analog of Response
    @PostMapping
    public Boolean registerUser(@RequestBody Login user) {
        return userService.insertUser(user);
    }
}
