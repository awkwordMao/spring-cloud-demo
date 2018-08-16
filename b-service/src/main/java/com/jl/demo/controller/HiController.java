package com.jl.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/b")
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "This is " + port;
    }
}
