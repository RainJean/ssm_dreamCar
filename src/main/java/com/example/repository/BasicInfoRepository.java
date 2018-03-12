package com.example.repository;

import com.example.domain.carInfo.BasicInfo;

import java.util.List;

public interface BasicInfoRepository {
    List<BasicInfo> select();
}
