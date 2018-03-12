package com.example.service.impl;

import com.example.config.RootConfig;
import com.example.domain.user.Gender;
import com.example.domain.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;

    //测试前先该name属性的值  数据库name被设置唯一约束
    @Test
    public void test(){
        User user=new User();
        user.setuName("123456900");
        user.setuAddress("天津市");
        user.setuBornDate(Date.valueOf("2017-01-01"));
        user.setuEmail("123@qq.com");
        user.setuIdentityCard("123456789012345678");
        user.setuPassWord("123");
        user.setuPhone("12345678901");
        user.setEnabled(true);
        Gender gender=new Gender();
        gender.setgId(1);
        user.setGender(gender);

        userService.signIn(user);
        userService.select().forEach(e-> System.out.println(e));

        User user1= userService.selById(3);
        System.out.println(user1);

    }


    @Test
    public void test01(){
        userService.select().forEach(e-> System.out.println(e));

    }

    @Test
    public void test02(){
        userService.delete(16);
        userService.delete(15);
        userService.delete(18);
    }

}