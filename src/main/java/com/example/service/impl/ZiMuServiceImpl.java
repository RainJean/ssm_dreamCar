package com.example.service.impl;

import com.example.domain.dizhi.DaXieZiMu;
import com.example.repository.ZiMuRepository;
import com.example.service.ZiMuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZiMuServiceImpl implements ZiMuService{
    @Autowired
    private ZiMuRepository ziMuRepository;

    @Override
    public List<DaXieZiMu> select() {
        return ziMuRepository.select();
    }
}
