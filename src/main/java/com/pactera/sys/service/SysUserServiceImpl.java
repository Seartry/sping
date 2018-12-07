package com.pactera.sys.service;

import com.pactera.sys.dao.SysUserMapper;
import com.pactera.sys.model.SysUser;
import com.pactera.util.EncrypUtil;
import com.pactera.util.MyProperties;
import com.pactera.util.Result;
import com.pactera.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    private static Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private MyProperties myProperties;


    @Override
    public Result exists(SysUser sysUser) {
        if (sysUser == null){
            return ResultUtil.failure("用户名不能空着哦！");
        }
        String userPassword = sysUser.getUserPassword();
        if (!StringUtils.isEmpty(userPassword)){
            try {
                sysUser.setUserPassword(EncrypUtil.aesEncrypt(sysUser.getUserPassword(), myProperties.getKey()));
            } catch (Exception e) {
                logger.error("加密失败！");
                return ResultUtil.failure("用户名或密码错误，重新登陆！");
            }
        }
        sysUser = sysUserMapper.selectByUserNameAndUserPassword(sysUser);
        if(sysUser != null){
            return ResultUtil.success("登陆成功！",sysUser);
        }
        return ResultUtil.failure("用户名或密码错误，重新登陆！");
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Result signIn(SysUser sysUser) {
        if (sysUser == null && StringUtils.isEmpty(sysUser.getUserName())){
            return ResultUtil.failure("用户名不能空着哦！");
        }
        if (userNameIsExists(sysUser.getUserName())){
            return ResultUtil.failure("该用户名太火，早已被抢跑啦！");
        }
        try {
            sysUser.setUserPassword(EncrypUtil.aesEncrypt(sysUser.getUserPassword(),myProperties.getKey()));
        } catch (Exception e) {
            logger.error("加密失败！原因："+e.getMessage());
            return ResultUtil.failure("密码太奇怪了，再换个好记的吧！");
        }
        int flag = sysUserMapper.insertSelective(sysUser);
        if (flag > 0){
            return ResultUtil.success("恭喜您成功加入我们的队伍！");
        }
        return ResultUtil.failure("您加入组织的路途比较艰辛哦，再试试吧！");
    }

    private boolean userNameIsExists(String userName) {
        SysUser sysUser = sysUserMapper.findByUserName(userName);
        if(sysUser != null){
            return true;
        }
        return false;
    }
}
