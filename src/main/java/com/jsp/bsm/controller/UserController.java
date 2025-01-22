package com.jsp.bsm.controller;

import com.jsp.bsm.entity.User;
import com.jsp.bsm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

@Autowired
    private UserService userService;
    @PostMapping("/register")
        public ResponseEntity<User> addUser(@RequestBody User user) {
            User createdUser = userService.addUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        }

    }

