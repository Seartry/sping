package com.pactera.sys.controller;

import com.alibaba.fastjson.JSON;
import com.pactera.sys.model.SysUser;
import com.pactera.sys.service.SysUserService;
import com.pactera.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("sysUser")
@RestController
@Controller
public class SysUserController {
    private Logger logger = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Result login(@RequestBody Map<String,Object> reqMap) {
        SysUser sysUser = JSON.parseObject(JSON.toJSONString(reqMap),SysUser.class);
        Result result = sysUserService.exists(sysUser);
        logger.info(result.toString());
        return result;
    }

    @RequestMapping("/signIn")
    public Result signIn(@RequestBody Map<String,Object> reqMap) {
        SysUser sysUser = JSON.parseObject(JSON.toJSONString(reqMap),SysUser.class);
        Result result = sysUserService.signIn(sysUser);
        logger.info(result.toString());
        return result;
    }

}