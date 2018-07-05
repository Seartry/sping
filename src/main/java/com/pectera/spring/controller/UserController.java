package com.pectera.spring.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.pectera.spring.model.User;
import com.pectera.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        ResponseEntity responseEntity = restTemplate.getForEntity("http://127.0.0.1:8080/user/getUserList",List.class);
        logger.info("成功进入UserController方法！");
        logger.info("responseEntity.getHeaders().getPragma():"+responseEntity.getHeaders().getPragma());
        logger.info("responseEntity.getBody().toString():"+responseEntity.getBody().toString());
        return "hello restTemplate ! responseEntity.getBody().toString() --"+responseEntity.getBody().toString();
    }

    @ResponseBody
    @RequestMapping("/add")
    public int addUser(User user){
        return userService.insert(user);
    }

    @ResponseBody
    @RequestMapping("/deleteByPrimaryKey")
    public int deteleByPrimaryKey(@RequestParam(value = "userId")Integer userId){
        return userService.deleteByPrimaryKey(userId);
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public int updateUserByPrimaryKey(User user){
        return userService.updateByPrimaryKey(user);
    }

    @ResponseBody
    @RequestMapping("/findUserById")
    public User findUserById(@RequestParam(value = "userId",required = true)Integer userId){
        return userService.selectByPrimaryKey(userId);
    }

    @ResponseBody
    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return userService.getAllUsers();
    }

    @ResponseBody
    @RequestMapping("/findByPage")
    public PageInfo<User> findBypage(@RequestParam("pageNo") int pageNo, @RequestParam int pageSize){
        PageInfo<User> pageInfo = userService.findByPage(pageNo,pageSize);
        return pageInfo;
    }
}
