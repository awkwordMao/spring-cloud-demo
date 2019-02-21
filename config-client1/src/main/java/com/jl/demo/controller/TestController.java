package com.jl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
//    @Value("${myname}")
//    String name;

    @Autowired
    private Environment environment;

    @Value("${spring.application.name}")
    String applicationName;
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(){
        String name =  environment.getProperty("myname");
        return name;
    }
}
