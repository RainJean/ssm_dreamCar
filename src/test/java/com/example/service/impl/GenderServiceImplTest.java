package com.example.service.impl;

import com.example.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class GenderServiceImplTest {
    @Autowired
    private GenderServiceImpl genderService;

    @Test
    public void test(){
        genderService.select().forEach(e->System.out.println(e));
    }

}