package com.pactera.sys.dao;

import com.pactera.sys.model.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}