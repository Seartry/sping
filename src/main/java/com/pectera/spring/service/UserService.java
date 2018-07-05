package com.pectera.spring.service;

import com.github.pagehelper.PageInfo;
import com.pectera.spring.model.User;

import java.util.List;

public interface UserService {
    int insert(User user);
    User selectByPrimaryKey(Integer id);
    int deleteByPrimaryKey(Integer userId);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getAllUsers();

    PageInfo<User> findByPage(int pageNo, int pageSize);

}

