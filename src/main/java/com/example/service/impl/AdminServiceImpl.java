package com.example.service.impl;

import com.example.domain.user.Admin;
import com.example.repository.AdminRepository;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void update(Admin admin) {
        adminRepository.update(admin);
    }

    @Override
    public Admin checkAdmin(Admin admin) {
        return adminRepository.checkAdmin(admin);
    }

}
