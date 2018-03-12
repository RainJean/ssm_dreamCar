package com.example.service.impl;

import com.example.domain.carInfo.BasicInfo;
import com.example.repository.BasicInfoRepository;
import com.example.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicInfoServiceImpl implements BasicInfoService{
    @Autowired
    private BasicInfoRepository basicInfoRepository;

    @Override
    public List<BasicInfo> select() {
        return basicInfoRepository.select();
    }
}
