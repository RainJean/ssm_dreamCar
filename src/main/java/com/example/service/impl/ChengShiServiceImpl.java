package com.example.service.impl;

import com.example.domain.dizhi.ChengShi;
import com.example.repository.ChengShiRepository;
import com.example.service.ChengShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChengShiServiceImpl implements ChengShiService {
    @Autowired
    private ChengShiRepository chengShiRepository;

    @Override
    public List<ChengShi> select() {
        return chengShiRepository.select();
    }
}
