package com.example.service.impl;

import com.example.domain.carInfo.Engine;
import com.example.repository.EngineRepository;
import com.example.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineServiceImpl implements EngineService {
    @Autowired
    private EngineRepository engineRepository;

    @Override
    public List<Engine> select() {
        return engineRepository.select();
    }
}
