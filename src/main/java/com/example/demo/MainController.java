package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {

    @RequestMapping(value = "/index" ,method = RequestMethod.GET ,params = "sessionCode")
    public String indexView(Model model) throws Exception{
        model.addAttribute("mav", "mav 模型 结构");
        return "index";
    }
    
}
