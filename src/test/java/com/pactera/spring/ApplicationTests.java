package com.pactera.spring;

import com.pactera.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testPageHelper(){

	}


}
