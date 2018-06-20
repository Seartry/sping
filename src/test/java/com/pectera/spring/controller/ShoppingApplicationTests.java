package com.pectera.spring.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        stringRedisTemplate.opsForValue().set("abc","测试String");
        stringRedisTemplate.opsForList().leftPushAll("qq",list);
        stringRedisTemplate.opsForList().range("qwe",0,-1).forEach(value->{
            System.out.println(value);
        });
    }

}
