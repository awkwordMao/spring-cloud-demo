package com.jl.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "This is " + port;
    }
}
