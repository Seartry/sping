package com.pactera.sys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "   Welcome to Springboot world ！ ";
    }


}
