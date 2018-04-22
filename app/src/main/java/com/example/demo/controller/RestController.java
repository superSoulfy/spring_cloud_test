package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by soulfy on 2018/2/27.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    final private Logger logger = LoggerFactory.getLogger(RestController.class);

    private Environment environment;

    @Autowired
    public RestController(Environment environment) {
        this.environment = environment;
    }


    @RequestMapping(value = "/te")
    public String te2() {
        String profile = environment.getProperty("spring.profiles.active");
        String str = null;
        if ("node1".equals(profile)) {
            str = environment.getProperty("content");
        } else if ("node2".equals(profile)) {
            str = environment.getProperty("what");
        }
        logger.debug("get the str is {}", str);
        return str;
    }
}
