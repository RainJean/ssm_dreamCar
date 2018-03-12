package com.example.service.impl;

import com.example.domain.carInfo.Driving;
import com.example.repository.DrivingRepository;
import com.example.service.DrivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrivingServiceImpl implements DrivingService {

    @Autowired
    private DrivingRepository drivingRepository;

    @Override
    public List<Driving> select() {
        return drivingRepository.select();
    }
}
