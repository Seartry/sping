package com.pectera.spring.controller;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(MyCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("My CommandLineRunner is working!");
    }
}
