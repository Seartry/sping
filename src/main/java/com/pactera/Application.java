package com.pactera;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableAutoConfiguration
@EnableWebMvc
@SpringBootApplication
@EnableScheduling
@MapperScan("com.pactera.spring.mapper")
@ComponentScan(basePackages = {"com.pactera.util","com.pactera.spring.controller","com.pactera.spring.service"})
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
