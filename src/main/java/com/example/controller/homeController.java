package com.example.controller;


import com.example.domain.user.Gender;
import com.example.domain.user.User;
import com.example.repository.ZiMuRepository;
import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;
    @Autowired
    private GenderService genderService;
    @Autowired
    private ShengFenService shengFenService;
    @Autowired
    private ChengShiService chengShiService;
    @Autowired
    private ZiMuService ziMuService;


    @RequestMapping("/")
    public String dreamcar(Model model){
        model.addAttribute("shengfen",shengFenService.select());
        model.addAttribute("chengshi",chengShiService.select());
        model.addAttribute("zimu",ziMuService.select());
        return "shouye";
    }
    @RequestMapping("/shouye")
    public String dreamcar1(Model model,String cName){
        model.addAttribute("shengfen",shengFenService.select());
        model.addAttribute("chengshi",chengShiService.select());
        model.addAttribute("zimu",ziMuService.select());
        model.addAttribute("cName",cName);
        return "shouye";
    }

    @RequestMapping("/todreamcar")
    public String todreamcar(Model model){
        model.addAttribute("shengfen",shengFenService.select());
        model.addAttribute("chengshi",chengShiService.select());
        return "dreamcar";
    }

    @RequestMapping("/tocarInfo")
    public String tocarInfo(){
        return "carInfo";
    }

    @RequestMapping("/touserLogin")
    public String touserLogin(){
        return "userLogin";
    }

    @RequestMapping("/touserUpdate")
    public String touserUpdate( Model model){
        model.addAttribute("genders",genderService.select());
        model.addAttribute("users",userService.selById(1));
        return "userUpd";
    }

    @RequestMapping("/touserAddInfo")
    public String touserAddInfo(Model model){
        model.addAttribute("genders",genderService.select());
        return "userAddInfo";
    }

    @RequestMapping("/toadminLogin")
    public String toadminLogin(){
        return "adminLogin";
    }

    @RequestMapping("touserSelect")
    public String touserSelect( Model model){
        model.addAttribute(userService.select());
        return "userSelect";
    }

    @RequestMapping("userAdd")
    public String userAdd(User user, Integer genderId
            , Model model){
        Gender gender=new Gender();
        gender.setgId(genderId);
        user.setGender(gender);

        userService.signIn(user);

        return touserSelect(model);
    }

    @RequestMapping("userUpdate")
    public String userUpdate(User user, Integer genderId
            , Model model){
        Gender gender=new Gender();
        gender.setgId(genderId);
        user.setGender(gender);

        userService.update(user);

        return touserSelect(model);
    }



}
