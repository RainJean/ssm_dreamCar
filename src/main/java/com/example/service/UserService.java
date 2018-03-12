package com.example.service;

import com.example.domain.user.User;

import java.util.List;

public interface UserService {
    void signIn(User user);
    List<User> select();
    void delete(Integer uId);
    void update(User user);
    User selById(Integer uId);
    boolean selectEmail(String email);

}
