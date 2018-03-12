package com.example.repository;


import com.example.domain.user.Gender;

import java.util.List;

public interface GenderRepository {
    List<Gender> select();

}
