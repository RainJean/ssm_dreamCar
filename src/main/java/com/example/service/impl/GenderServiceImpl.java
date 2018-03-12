package com.example.service.impl;

import com.example.domain.user.Gender;
import com.example.repository.GenderRepository;
import com.example.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {
    @Autowired
    private GenderRepository genderRepository;

    @Override
    public List<Gender> select() {
        return genderRepository.select();
    }
}
