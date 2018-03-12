package com.example.repository;

import com.example.domain.carInfo.Engine;

import java.util.List;

public interface EngineRepository {
    List<Engine> select();
}
