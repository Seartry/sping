package com.pactera.sys.dao;

import com.pactera.sys.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper{

        SysUser findByUserName(String userName);

        int deleteByPrimaryKey(Long userId);

        int insert(SysUser record);

        int insertSelective(SysUser record);

        SysUser selectByPrimaryKey(Long userId);

        int updateByPrimaryKeySelective(SysUser record);

        int updateByPrimaryKey(SysUser record);

        SysUser selectByUserNameAndUserPassword(SysUser sysUser);
}
