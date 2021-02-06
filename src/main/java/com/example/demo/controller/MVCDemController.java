package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCDemController {

    @GetMapping("/mvcdemo")
    public ModelAndView Welcome (){
        User user = new User();
       user.setAges(28);
       user.setSex("男");
       user.setUserName("换哈");

       ModelAndView modelAndView = new ModelAndView("index");
       modelAndView.addObject("user", user);
       return modelAndView;

    }
    
}
