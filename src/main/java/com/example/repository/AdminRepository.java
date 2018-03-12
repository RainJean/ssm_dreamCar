package com.example.repository;


import com.example.domain.user.Admin;

public interface AdminRepository {
    void save(Admin admin);
    void update(Admin admin);
    Admin checkAdmin(Admin admin);

}
