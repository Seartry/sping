package com.pactera.common.controller;

import com.pactera.common.pojo.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RestfulController {

    private static final String templet = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/greeting")
    public Greeting getGreeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(templet,name));
    }

    @RequestMapping("/getClazzs")
    public List<Map<String,Object>> getClazzs(){
        String sql = "select * from clazz";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String,Object>> set = map.entrySet();
            if (set != null){
                Iterator it = set.iterator();
                while (it.hasNext()){
                    Map.Entry<String,Object> entry = (Map.Entry<String, Object>) it.next();
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }

}
