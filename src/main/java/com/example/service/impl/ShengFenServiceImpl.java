package com.example.service.impl;

import com.example.domain.dizhi.ShengFen;
import com.example.repository.ShengFenRepository;
import com.example.service.ShengFenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShengFenServiceImpl implements ShengFenService {

    @Autowired
    private ShengFenRepository shengFenRepository;

    @Override
    public List<ShengFen> select() {
        return shengFenRepository.select();
    }
}
