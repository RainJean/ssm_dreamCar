package com.example.repository;

import com.example.domain.carInfo.Driving;

import java.util.List;

public interface DrivingRepository {
    List<Driving> select();
}
