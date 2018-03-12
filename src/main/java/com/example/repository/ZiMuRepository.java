package com.example.repository;

import com.example.domain.dizhi.DaXieZiMu;

import java.util.List;

public interface ZiMuRepository {
    List<DaXieZiMu> select();
}
