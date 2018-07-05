package com.pectera.spring.mapper;

//import com.github.pagehelper.PageInfo;
import com.github.pagehelper.Page;
import com.pectera.spring.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUserList();

    List<User> findByPage();
}