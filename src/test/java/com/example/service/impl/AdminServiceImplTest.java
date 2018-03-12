package com.example.service.impl;


import com.example.config.RootConfig;
import com.example.domain.user.Admin;
import com.example.domain.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class AdminServiceImplTest {

    @Autowired
    private AdminServiceImpl adminService;
    @Autowired
    private UserServiceImpl userService;
//测试前先该name属性的值  数据库name被设置唯一约束
    @Test
    public void test() {
        Admin admin = new Admin();
        admin.setaName("tom11");
        admin.setaPassWord("123");
        adminService.save(admin);

        System.out.println(admin);

        admin = new Admin();
        admin.setaId(4);
        admin.setaName("tom1");
        admin.setaPassWord("123");
        adminService.update(admin);
        System.out.println(admin);


    }
    @Test
    public void test1() {
        Admin admin=new Admin("tom1","123");
        admin=adminService.checkAdmin(admin);
        if(admin!=null){
            List<User> list=userService.select();
            list.forEach(e->System.out.println(e));
        }
        System.out.println(admin);

    }

}