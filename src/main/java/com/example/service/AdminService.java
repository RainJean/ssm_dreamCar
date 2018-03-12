package com.example.service;



import com.example.domain.user.Admin;

public interface AdminService {
    void save(Admin admin);
    void update(Admin admin);
    Admin checkAdmin(Admin admin);


}
