package com.jsp.bsm.serviceimpl;

import com.jsp.bsm.entity.User;
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

//    @Override
//    public Optional<User> findById(int userId) {
//        return  userRepository.findById(userId);
//    }
//
//    @Override
//    public User updateUserById(User user) {
//        return userRepository.save(user);
 //   }
}
