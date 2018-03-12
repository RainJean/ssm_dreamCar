package com.example.service.impl;

import com.example.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class ShengFenServiceImplTest {

    @Autowired
    private ShengFenServiceImpl shengFenService;

    @Test
    public void test(){
        shengFenService.select().forEach(e->System.out.println(e));
    }
}