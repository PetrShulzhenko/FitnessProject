package com.fitness.webapp.controllers;

import com.fitness.webapp.model.IdsPair;
import com.fitness.webapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login_user")
public class UserLoginController {
    private final UserService userService;

    @Autowired
    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    // TODO: change return value to analog of Response
    @PostMapping
    public Integer loginUser(@RequestBody IdsPair pair) {
        return userService.validateUser(pair);
    }
}
