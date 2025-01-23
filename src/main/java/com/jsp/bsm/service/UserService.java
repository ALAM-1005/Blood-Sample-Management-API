package com.jsp.bsm.service;

import com.jsp.bsm.entity.User;
import com.jsp.bsm.exception.UserNotFoundByIdException;

import java.util.Optional;

public interface UserService {

   public  User addUser(User user);

   public Optional<User>  updateUserById(int user);

    User findUserById(int userId) throws UserNotFoundByIdException;
}

