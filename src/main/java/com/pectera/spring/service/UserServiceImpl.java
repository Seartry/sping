package com.pectera.spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pectera.spring.mapper.UserMapper;
import com.pectera.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional(rollbackFor = {RuntimeException.class,Exception.class})
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getUserList();
    }

    @Override
    public PageInfo<User> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<User> list = userMapper.findByPage();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo;
    }
}
