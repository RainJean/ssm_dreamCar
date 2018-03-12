package com.example.repository;

import com.example.domain.user.User;

import java.util.List;

public interface UserRepository {
    void insert(User user);

    void update(User user);

    void delete(Integer uId);

    List<User> select();

    User selById(Integer uId);

    boolean selectEmail(String email);
}
