package com.example.controller;

import com.example.domain.user.Admin;
import com.example.service.impl.AdminServiceImpl;
import com.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {

    @Autowired
    private AdminServiceImpl adminService;
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("admin")
    public String admin(){
        return "redirect:adminLogin";
    }

    @RequestMapping("adminLogin")
    public String adminLogin(Admin admin, Model model) {

        Admin admin1 = adminService.checkAdmin(admin);

        if (admin1 != null) {
            model.addAttribute(userService.select());
            return "userSelect";
        } else {
            return "adminLogin";
        }
    }
}
