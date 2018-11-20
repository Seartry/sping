package com.pactera.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")

//    @ResponseBody
    public @ResponseBody String index(){
        return "welcome to home page！";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}
