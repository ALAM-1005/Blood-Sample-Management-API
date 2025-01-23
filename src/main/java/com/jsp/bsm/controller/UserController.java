package com.jsp.bsm.controller;

import com.jsp.bsm.entity.User;
import com.jsp.bsm.exception.UserNotFoundByIdException;
import com.jsp.bsm.service.UserService;
import com.jsp.bsm.util.ResponseStructure;
import com.jsp.bsm.util.RestResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

@Autowired
    private UserService userService;
    private RestResponseBuilder restResponseBuildere;

    @PostMapping("/register")
//        public ResponseEntity<User> addUser(@RequestBody User user) {
//            User createdUser = userService.addUser(user);
//            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);

    public ResponseEntity<ResponseStructure<User>> registerUser(@RequestBody User user) {
        user = userService.addUser(user);
        return restResponseBuildere.success(HttpStatus.CREATED, "User Created", user);
    }

    @GetMapping("/find-users-by-id/{userId}")
    public ResponseEntity<ResponseStructure<User>> findUserById(@PathVariable int userId) throws UserNotFoundByIdException {
        User user = userService.findUserById(userId);
        return restResponseBuildere.success(HttpStatus.CREATED, "User finded", user);
    }

        }



