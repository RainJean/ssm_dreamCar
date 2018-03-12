package com.example.service.impl;

import com.example.domain.user.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void signIn(User user) {
        userRepository.insert(user);
    }


    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public User selById(Integer uId) {
        return userRepository.selById(uId);
    }

    @Override
    public List<User> select() {
        return userRepository.select();
    }

    @Override
    public void delete(Integer uId) {
        userRepository.delete(uId);
    }


    @Override
    public boolean selectEmail(String email) {
        return userRepository.selectEmail(email);
    }
}
