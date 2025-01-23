package com.jsp.bsm.serviceimpl;

import com.jsp.bsm.entity.User;
import com.jsp.bsm.exception.UserNotFoundByIdException;
import com.jsp.bsm.repository.UserRepository;
import com.jsp.bsm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> updateUserById(int user) {
        return Optional.empty();
    }

    @Override
    public User findUserById(int userId) throws UserNotFoundByIdException {
        Optional<User> optional = userRepository.findById(userId);

        if (optional.isEmpty())
            throw new UserNotFoundByIdException("Failed to find User");

        return optional.get();
    }
//    @Override
//    public Optional<User> updateUserById(int user) {
//        return Optional.empty();
//    }
}
